package net.elau.example.simplebookstore.domain.usecase.book.list

import net.elau.example.simplebookstore.domain.entity.book.BookRepository
import net.elau.example.simplebookstore.domain.entity.book.buildListCatalogBookDto

class ListCatalogBookUseCase(private val bookRepository: BookRepository) {

    fun list(name: String?) = bookRepository.list(name).map { it.buildListCatalogBookDto() }
}
