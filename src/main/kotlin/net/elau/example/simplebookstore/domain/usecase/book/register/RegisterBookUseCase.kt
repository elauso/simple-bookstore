package net.elau.example.simplebookstore.domain.usecase.book.register

import net.elau.example.simplebookstore.domain.entity.book.BookRepository

class RegisterBookUseCase(private val bookRepository: BookRepository) {

    fun register(registerBookDto: RegisterBookDto) {
        val book = registerBookDto.buildBook()
        bookRepository.register(book)
    }
}
