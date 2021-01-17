package net.elau.example.simplebookstore.domain.entity.book

data class Book(

    val name: String,

    val isbn10: ISBN10,

    val isbn13: ISBN13,

    val genre: Genre,

    val publisher: String,

    val paperback: Int,

    val language: Language
)
