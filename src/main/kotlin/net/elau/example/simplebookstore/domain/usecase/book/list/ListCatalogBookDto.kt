package net.elau.example.simplebookstore.domain.usecase.book.list

import net.elau.example.simplebookstore.domain.entity.book.Genre
import net.elau.example.simplebookstore.domain.entity.book.Language
import net.elau.example.simplebookstore.infra.web.controller.book.list.ListCatalogBookResponse

data class ListCatalogBookDto(

    val name: String,

    val isbn10: String,

    val isbn13: String,

    val genre: Genre,

    val publisher: String,

    val paperback: Int,

    val language: Language
)

fun ListCatalogBookDto.buildListCatalogBookResponse() =
    ListCatalogBookResponse(name, isbn10, isbn13, genre, publisher, paperback, language)
