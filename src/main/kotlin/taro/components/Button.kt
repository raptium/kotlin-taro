@file:JsModule("@tarojs/components")
@file:JsNonModule

package taro.components

import react.RClass

@JsName("Button")
external val button: RClass<ButtonProps>

external interface ButtonProps : StandardProps<Any> {
    var size: String?
    var type: String?
    var plain: Boolean?
    var disabled: Boolean?
    var loading: Boolean?
    var hoverClass: String?
    var hoverStopPropagation: Boolean?
    var hoverStartTime: Int?
    var hoverStayTime: Int?
}
