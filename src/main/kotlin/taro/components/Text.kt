import react.RClass
import react.RProps

@JsName("Text")
external val text: RClass<TextProps>

external interface TextProps : RProps {
    var selectable: Boolean
    var space: String
    var decode: Boolean
}
