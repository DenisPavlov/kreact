package network.components.profile.posts

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.button
import react.dom.div
import react.dom.textArea
import kotlin.random.Random

class MyPosts(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        div {
            +"My posts"
            div {
                textArea { }
                button { +"Add post" }
                button { +"Remove" }
            }
            div(classes = "posts") {
                repeat(10) {
                    child(Post::class) {
                        attrs {
                            avatarSrc = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSq_I0JFO2DxoAV3J-sI7ajtx0qW0Q5neaY_A&usqp=CAU"
                            text = "Post $it"
                            likesCount = Random.nextInt(0, 100)
                        }
                    }
                }
            }
        }
    }
}