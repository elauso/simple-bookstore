package net.elau.example.simplebookstore.infra.db.book

import net.elau.example.simplebookstore.domain.entity.book.Book
import net.elau.example.simplebookstore.domain.entity.book.BookRepository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class BookRepositoryJdbcTemplate(private val jdbcTemplate: JdbcTemplate) : BookRepository {

    override fun register(book: Book) {
        val sql = "insert into books(name,isbn10,isbn13,genre,publisher,paperback,language) values(?,?,?,?,?,?,?)"
        jdbcTemplate.update(sql, *arrayOf<Any>(book.name, book.isbn10.value, book.isbn13.value, book.genre.name, book.publisher, book.paperback, book.language.name))
    }
}
