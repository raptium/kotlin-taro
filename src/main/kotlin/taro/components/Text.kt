@file:JsModule("@tarojs/components")
@file:JsNonModule

package taro.components

import react.RClass

@JsName("Text")
external val text: RClass<TextProps>

external interface TextProps : StandardProps<Any> {
    var selectable: Boolean
    var space: String
    var decode: Boolean
}
