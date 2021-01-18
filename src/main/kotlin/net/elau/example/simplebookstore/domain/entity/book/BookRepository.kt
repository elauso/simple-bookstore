package net.elau.example.simplebookstore.domain.entity.book

interface BookRepository {

    fun list(name: String?): List<Book>

    fun register(book: Book)
}
