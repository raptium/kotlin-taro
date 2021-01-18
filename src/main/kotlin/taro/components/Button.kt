@file:JsModule("@tarojs/components")
@file:JsNonModule

package taro.components

import react.RClass

@JsName("Button")
external val button: RClass<ButtonProps>

external interface ButtonProps : StandardProps<Any> {
    var size: String
    var type: String
}
