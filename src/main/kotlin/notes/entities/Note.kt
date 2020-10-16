package notes.entities

import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
class Note(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false, name = "user_name")
    @get:NotNull(message = "UserName cannot be null")
    @get:Size(min = 2, max = 20, message = "Age should be between 2 and 20")
    val userName: String,

    @Column(nullable = false)
    @get:NotNull(message = "Text cannot be null")
    val text: String
)