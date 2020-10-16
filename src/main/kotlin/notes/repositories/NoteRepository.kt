package notes.repositories

import notes.entities.Note
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "note")
interface NoteRepository : PagingAndSortingRepository<Note, Long>{}