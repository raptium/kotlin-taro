@file:JsModule("@tarojs/taro")
@file:JsNonModule

package taro.taro.navigation

import taro.taro.General
import kotlin.js.Promise

@JsName("navigateTo")
external fun navigateTo(option: NavigateTo.Option): Promise<General.CallbackResult>

external interface NavigateTo {
    interface Option {
        var url: String
        var events: dynamic
        var success: ((General.CallbackResult) -> Unit)?
        var complete: ((General.CallbackResult) -> Unit)?
        var fail: ((General.CallbackResult) -> Unit)?
    }
}
