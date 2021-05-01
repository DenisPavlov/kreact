package example01

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.a
import react.dom.div

class Header(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        div {
            a(href = "#s") { +"Home" }
            +" -> "
            a(href = "#s") { +"News Feed" }
            +" -> "
            a(href = "#s") { +"Messages" }
            +" -> "
        }
    }
}