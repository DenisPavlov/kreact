package network.components.header

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.img
import styled.css
import styled.styledHeader

class Header(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        styledHeader {
            css {
                backgroundColor = Color.red
                gridColumn = GridColumn("1 / -1")
                gridRow = GridRow("1")

                child("img") {
                    height = 60.px
                }
            }
            img(src = "https://upload.wikimedia.org/wikipedia/ru/2/2c/Novosibirsk_FC_logo_2020.png") { }
        }
    }
}