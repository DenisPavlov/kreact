package example01

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.li
import react.dom.ul

class Technologies(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        div {
            ul {
                li { +"Kotlin" }
                li { +"css" }
                li { +"html" }
            }
        }
    }
}