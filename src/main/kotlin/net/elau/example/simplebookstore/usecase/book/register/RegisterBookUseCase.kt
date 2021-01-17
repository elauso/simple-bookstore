package net.elau.example.simplebookstore.usecase.book.register

import net.elau.example.simplebookstore.entity.book.BookRepository

class RegisterBookUseCase(private val bookRepository: BookRepository) {

    fun register(registerBookDto: RegisterBookDto) {
        val book = registerBookDto.buildBook()
        bookRepository.register(book)
    }
}
