import kotlinx.browser.document
import kotlinx.browser.window
import network.App
import react.dom.render

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            /*child(Welcome::class) {
                attrs {
                    name = "Kotlin/JS"
                }
            }*/

            child(App::class) {}
        }
    }
}
