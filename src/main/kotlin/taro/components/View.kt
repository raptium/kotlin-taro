@file:JsModule("@tarojs/components")
@file:JsNonModule

package taro.components

import react.RClass

@JsName("View")
external val view: RClass<ViewProps>

external interface ViewProps : StandardProps<Any> {
    var hoverClass: String?
    var hoverStyle: String?
    var hoverStopPropagation: Boolean?
    var hoverStartTime: Int?
    var hoverStayTime: Int?
    var catchMove: Boolean?
}
