package taro

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

@JsExport
class MyComponent : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div { }
    }
}
