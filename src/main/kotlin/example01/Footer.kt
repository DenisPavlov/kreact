package example01

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

class Footer(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        div {
            +"denispavlov.com"
        }
    }
}