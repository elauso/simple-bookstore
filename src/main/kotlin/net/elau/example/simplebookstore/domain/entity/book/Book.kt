package net.elau.example.simplebookstore.domain.entity.book

import net.elau.example.simplebookstore.domain.usecase.book.list.ListCatalogBookDto

data class Book(

    val name: String,

    val isbn10: ISBN10,

    val isbn13: ISBN13,

    val genre: Genre,

    val publisher: String,

    val paperback: Int,

    val language: Language
)

fun Book.buildListCatalogBookDto() =
    ListCatalogBookDto(name, isbn10.value, isbn13.value, genre, publisher, paperback, language)
