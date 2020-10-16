package notes.controllers

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("note")
class NoteController {

    @GetMapping("/")
    fun getNote(model: Model): String {
        return "Hello World"
    }

    @PostMapping("/")
    fun createNote(userName: String, noteText: String): String {
        println("asasas")
        return userName;
    }

}
