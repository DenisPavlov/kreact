package example01

import react.*

class App1(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        child(Header::class) {}
        child(Technologies::class) {}
        child(Footer::class) {}
    }

}

