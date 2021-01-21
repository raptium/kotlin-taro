@file:JsModule("@tarojs/components")
@file:JsNonModule

package taro.components

import react.RClass

@JsName("Input")
external val input: RClass<InputProps>

external interface InputProps : StandardProps<Any>, FormItemProps {
    var value: String?
    var type: String?
    var password: Boolean?
    var placeholder: String?
    var placeholderStyle: String?
    var placeholderClass: String?
    var disabled: Boolean?
    var maxlength: Int?
    var cursorSpacing: Int?
    var autoFocus: Boolean?
    var focus: Boolean?
    var confirmType: String?
    var confirmHold: Boolean?
    var cursor: Int?
    var selectionStart: Int?
    var selectionEnd: Int?
    var adjustPosition: Boolean?
    var holdKeyboard: Boolean?
    var alwaysEmbed: Boolean?
    var randomNumber: Boolean?
    var controlled: Boolean?
    var onInput: CommonEventFunction<InputEventDetail>?
    var onFocus: CommonEventFunction<InputForceEventDetail>?
    var onBlur: CommonEventFunction<InputValueEventDetail>?
    var onConfirm: CommonEventFunction<InputValueEventDetail>?
    var onKeyboardHeightChange: CommonEventFunction<OnKeyboardHeightChangeEventDetail>?

    interface InputEventDetail {
        val value: String
        val cursor: Number
        val keyCode: Int
    }

    interface InputForceEventDetail {
        val value: String
        val height: Number
    }

    interface InputValueEventDetail {
        val value: String
    }

    interface OnKeyboardHeightChangeEventDetail {
        val height: Number
        val duration: Number
    }
}
