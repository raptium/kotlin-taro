@file:JsModule("@tarojs/components")
@file:JsNonModule

package taro.components

import react.RClass

@JsName("Image")
external val image: RClass<ImageProps>

external interface ImageProps : StandardProps<Any> {
    var src: String?
    var mode: String?
    var webp: Boolean?
    var lazyLoad: Boolean?
    var showMenuByLongpress: Boolean?
    var onError: CommonEventFunction<OnErrorEventDetail>?
    var onLoad: CommonEventFunction<OnLoadEventDetail>?

    interface OnErrorEventDetail {
        val errMsg: String
    }

    interface OnLoadEventDetail {
        val height: dynamic // number | string
        val width: dynamic // number | string
    }
}
