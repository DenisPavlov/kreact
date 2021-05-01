package network

import kotlinx.css.*
import network.components.header.Header
import network.components.navbar.Navbar
import network.components.profile.Profile
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv

class App(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        styledDiv {
            css {
                display = Display.grid
                width = 1200.px
                margin(0.px, LinearDimension.auto)

                gridTemplateRows = GridTemplateRows(60.px, 1.fr)
                gridTemplateColumns = GridTemplateColumns(2.fr, 10.fr)
//              gap = Gap("10px")
            }
            child(Header::class) {}
            child(Navbar::class) {}
            child(Profile::class) {}
        }
    }
}