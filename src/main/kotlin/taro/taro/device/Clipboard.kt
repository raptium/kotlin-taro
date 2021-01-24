@file:JsModule("@tarojs/taro")
@file:JsNonModule

package taro.taro.device

import taro.taro.General
import kotlin.js.Promise


external interface Clipboard {
    interface Option {
        var data: String
    }
}


@JsName("setClipboardData")
external fun setClipboardData(option: Clipboard.Option): Promise<General.CallbackResult>

