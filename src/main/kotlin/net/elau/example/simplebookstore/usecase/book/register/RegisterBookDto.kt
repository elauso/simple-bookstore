package net.elau.example.simplebookstore.usecase.book.register

import net.elau.example.simplebookstore.entity.book.*

data class RegisterBookDto(

    val name: String,

    val isbn10: String,

    val isbn13: String,

    val genre: Genre,

    val publisher: String,

    val paperback: Int,

    val language: Language
) {

    fun buildBook() = Book(name, ISBN10(isbn10), ISBN13(isbn13), genre, publisher, paperback, language)
}
