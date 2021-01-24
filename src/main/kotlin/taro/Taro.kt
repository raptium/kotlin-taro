package taro

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.await
import taro.taro.General
import taro.taro.device.Clipboard
import taro.taro.navigation.NavigateTo
import taro.taro.network.RequestOption
import taro.taro.network.RequestTask

object Taro {
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
    suspend fun <T, U> request(option: RequestOption<U>): SuccessCallbackResult<T> {
        val task: RequestTask<T> = taro.taro.network.request(option)
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

    fun getCurrentInstance() = taro.taro.navigation.getCurrentInstance()

    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
    suspend fun navigateTo(builder: NavigateTo.Option.() -> Unit): CallbackResult {
        return taro.taro.navigation.navigateTo((js("{}") as NavigateTo.Option).apply(builder))
            .then { CallbackResult(it.errMsg) }
            .await()
    }

    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
    suspend fun setClipboardData(data: String) {
        taro.taro.device.setClipboardData((js("{}") as Clipboard.Option).apply { this.data = data }).await()
    }

    data class SuccessCallbackResult<T>(
        var data: T,
        var header: dynamic,
        var statusCode: Int,
        override var errMsg: String? = null,
    ) : General.CallbackResult

    data class CallbackResult(
        var errMsg: String?,
    )
}
