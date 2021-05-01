package network.components.profile

import kotlinx.css.*
import network.components.profile.posts.MyPosts
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.img
import styled.css
import styled.styledDiv

class Profile(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        styledDiv {
            css {
                backgroundColor = Color.yellow
                child("img") {
                    width = LinearDimension.auto
                }
            }
            img(src = "https://cdn.sptmr.ru/upload/dip/library/fb_chooseBoots/pic1.jpg") { }
            div {
                +"Avatar + description"
            }
            child(MyPosts::class) {}
        }
    }
}