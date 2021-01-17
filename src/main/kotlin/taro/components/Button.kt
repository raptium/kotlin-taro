package taro.components

import react.RClass

@JsName("Button")
@JsModule("@tarojs/components")
external val button: RClass<ButtonProps>

external interface ButtonProps : StandardProps<Any> {
    var size: String
    var type: String
}
