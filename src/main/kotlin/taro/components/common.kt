@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package taro.components

import org.w3c.dom.Touch
import react.RProps
import kotlin.js.Json

external interface `T$0` {
    var actions: Array<Any?>
}

external interface `T$1` {
    var __html: String
}

external interface StandardProps<T> : EventProps<T> {
    var id: String?
    var className: String?
    var style: dynamic /* String? | CSSProperties? */
    var key: dynamic /* String? | Number? */
    var hidden: Boolean?
    var animation: `T$0`?
    var ref: Any?
    var dangerouslySetInnerHTML: `T$1`?
}

external interface FormItemProps {
    var name: String?
}

external interface EventProps<T> : RProps {
    var onTouchStart: ((event: ITouchEvent<Any>) -> Unit)?
    var onTouchMove: ((event: ITouchEvent<Any>) -> Unit)?
    var onTouchCancel: ((event: ITouchEvent<Any>) -> Unit)?
    var onTouchEnd: ((event: ITouchEvent<Any>) -> Unit)?
    var onClick: ((event: ITouchEvent<Any>) -> Unit)?
    var onLongPress: ((event: CommonEvent<T>) -> Unit)?
    var onLongClick: ((event: CommonEvent<T>) -> Unit)?
    var onTransitionEnd: ((event: CommonEvent<T>) -> Unit)?
    var onAnimationStart: ((event: CommonEvent<T>) -> Unit)?
    var onAnimationIteration: ((event: CommonEvent<T>) -> Unit)?
    var onAnimationEnd: ((event: CommonEvent<T>) -> Unit)?
    var onTouchForceChange: ((event: CommonEvent<T>) -> Unit)?
}

typealias BaseEventOrigFunction<T> = (event: BaseEventOrig<T>) -> Unit

typealias TouchEventFunction = (event: ITouchEvent<Any>) -> Unit

typealias CommonEvent<T> = BaseEventOrig<T>

typealias CommonEventFunction<T> = BaseEventOrigFunction<T>

external interface BaseEventOrig<T> {
    var type: String
    var timeStamp: Number
    var target: Target
    var currentTarget: CurrentTarget
    var detail: T
    var preventDefault: () -> Unit
    var stopPropagation: () -> Unit
}

external interface ITouchEvent<T> : BaseEventOrig<T> {
    var touches: Array<ITouch>
    var changedTouches: Array<CanvasTouch>
}

external interface CanvasTouch {
    var identifier: Number
    var x: Number
    var y: Number
}

external interface ITouch : Touch {
    override var identifier: Int
    override var pageX: Int
    override var pageY: Int
    override var clientX: Int
    override var clientY: Int
}

external interface Target {
    var id: String
    var tagName: String
    var dataset: Json
}

external interface CurrentTarget : Target

external interface NetStatus {
    var videoBitrate: Number?
    var audioBitrate: Number?
    var videoFPS: dynamic /* Number? | String? */
    var videoGOP: Number?
    var netSpeed: Number?
    var netJitter: Number?
    var videoWidth: dynamic /* Number? | String? */
    var videoHeight: dynamic /* Number? | String? */
}
