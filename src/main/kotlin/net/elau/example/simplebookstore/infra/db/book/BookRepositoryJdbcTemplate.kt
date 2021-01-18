package net.elau.example.simplebookstore.infra.db.book

import net.elau.example.simplebookstore.domain.entity.book.*
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class BookRepositoryJdbcTemplate(private val jdbcTemplate: JdbcTemplate) : BookRepository {

    override fun list(name: String?): List<Book> {
        val sql = StringBuilder("select * from books where 1=1")
        val params = mutableListOf<Any>()
        name?.let {
            sql.append(" and name like ?")
            params.add("%$name%")
        }
        return jdbcTemplate.query(
            sql.toString(), params.toTypedArray()
        ) { rs, _ ->
            Book(
                rs.getString("name"), ISBN10(rs.getString("isbn10")), ISBN13(rs.getString("isbn13")),
                Genre.valueOf(rs.getString("genre")), rs.getString("publisher"), rs.getInt("paperback"),
                Language.valueOf(rs.getString("language"))
            )
        }
    }

    override fun register(book: Book) {
        val sql = "insert into books(name,isbn10,isbn13,genre,publisher,paperback,language) values(?,?,?,?,?,?,?)"
        jdbcTemplate.update(sql, *arrayOf<Any>(book.name, book.isbn10.value, book.isbn13.value, book.genre.name, book.publisher, book.paperback, book.language.name))
    }
}
