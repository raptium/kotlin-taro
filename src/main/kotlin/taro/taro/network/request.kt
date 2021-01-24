@file:JsModule("@tarojs/taro")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package taro.taro.network

import taro.taro.General
import kotlin.js.Promise

@JsName("request")
external fun <T, U> request(option: RequestOption<U>): RequestTask<T>

@JsName("addInterceptor")
external fun addInterceptor(callback: Function<*>)

external interface RequestTask<T> : Promise<SuccessCallbackResult<T>> {
    fun abort()
    fun offHeadersReceived(callback: (General.CallbackResult) -> Unit)
    fun onHeadersReceived(callback: (OnHeadersReceivedCallbackResult) -> Unit)
    interface OnHeadersReceivedCallbackResult {
        var header: Any
    }
}

external interface RequestOption<U> {
    var url: String
    var complete: ((res: General.CallbackResult) -> Unit)?
    var data: U?
    var dataType: String? /* "json" | String? */
    var fail: ((res: General.CallbackResult) -> Unit)?
    var header: Any?
    var method: String? /* "OPTIONS" | "GET" | "HEAD" | "POST" | "PUT" | "DELETE" | "TRACE" | "CONNECT" */
    var responseType: String? /* "text" | "arraybuffer" */
    var success: ((result: SuccessCallbackResult<Any>) -> Unit)?
    var jsonp: Boolean?
    var jsonpCache: Boolean?
    var mode: String? /* "no-cors" | "cors" | "same-origin" */
    var credentials: String? /* "include" | "same-origin" | "omit" */
    var cache: String? /* "default" | "no-cache" | "reload" | "force-cache" | "only-if-cached" */
    var timeout: Number?
    var retryTimes: Number?
    var backup: dynamic /* String? | Array<String>? */
    val dataCheck: (() -> Boolean)?
    var useStore: Boolean?
    var storeCheckKey: String?
    var storeSign: String?
    val storeCheck: (() -> Boolean)?
}

external interface SuccessCallbackResult<T> : General.CallbackResult {
    var data: T
    var header: dynamic
    var statusCode: Int
}

