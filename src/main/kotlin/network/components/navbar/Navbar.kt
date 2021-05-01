package network.components.navbar

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.a
import react.dom.div
import styled.css
import styled.styledNav

class Navbar(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        styledNav {
            css {
                backgroundColor = Color.green
                gridColumn = GridColumn("1")
                gridRow = GridRow("2 / -1")

                child("div") {
                    color = Color.white
                }
            }

            div {
                a {
                    +"Profile"
                }
            }
            div {
                a {
                    +"Messages"
                }
            }
            div {
                a {
                    +"News"
                }
            }
            div {
                a {
                    +"Music"
                }
            }
            div {
                a {
                    +"Settings"
                }
            }
        }
    }
}