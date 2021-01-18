package net.elau.example.simplebookstore.infra.web.controller.book.list

import net.elau.example.simplebookstore.domain.entity.book.Genre
import net.elau.example.simplebookstore.domain.entity.book.Language

data class ListCatalogBookResponse(

    val name: String,

    val isbn10: String,

    val isbn13: String,

    val genre: Genre,

    val publisher: String,

    val paperback: Int,

    val language: Language
)
