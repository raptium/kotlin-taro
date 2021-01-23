package taro

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.await
import taro.network.CallbackResult
import taro.network.RequestOption
import taro.network.RequestTask

object Taro {
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
    suspend fun <T, U> request(option: RequestOption<U>): SuccessCallbackResult<T> {
        val task: RequestTask<T> = taro.network.request(option)
        try {
            return task.then {
                // work around
                // coroutine onResume produces `isObject()` check in JS
                // somehow the external interface `SuccessCallbackResult` returned from mini program runtime is NOT an `object` :-(
                SuccessCallbackResult(it.data, it.header, it.statusCode, it.errMsg)
            }.await()
        } catch (ex: CancellationException) {
            task.abort()
            throw ex
        }
    }

    data class SuccessCallbackResult<T>(
        var data: T,
        var header: dynamic,
        var statusCode: Int,
        override var errMsg: String? = null,
    ) : CallbackResult
}
