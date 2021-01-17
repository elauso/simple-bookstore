package net.elau.example.simplebookstore.domain.usecase.book.register

import net.elau.example.simplebookstore.domain.entity.book.BookRepository

class RegisterCatalogBookUseCase(private val bookRepository: BookRepository) {

    fun register(registerCatalogBookDto: RegisterCatalogBookDto) {
        val book = registerCatalogBookDto.buildBook()
        bookRepository.register(book)
    }
}
