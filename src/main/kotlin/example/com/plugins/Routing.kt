package example.com.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/about"){
            val text = "<h1>Hello Android</h1>"
            val type = ContentType.parse("text/html")
            call.respondText(text, type)
        }
    }
}
