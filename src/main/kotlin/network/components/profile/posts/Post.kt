package network.components.profile.posts

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.img
import react.dom.span
import styled.css
import styled.styledDiv

external interface PostProps : RProps {
    var text: String
    var avatarSrc: String
    var likesCount: Int
}

class Post(props: PostProps) : RComponent<PostProps, RState>(props) {
    override fun RBuilder.render() {
        styledDiv {
            css {
                color = Color.red

                child("img") {
                    width = 80.px
                    height = 80.px
                    borderRadius = 40.px
                }
            }
            img(src = props.avatarSrc) { }
            +props.text
            div {
                span { +"Like" }
                +" ${props.likesCount}"
            }
        }
    }
}