package net.elau.example.simplebookstore.domain.entity.borrow

import net.elau.example.simplebookstore.domain.entity.book.Book
import net.elau.example.simplebookstore.domain.entity.student.Student
import java.time.LocalDate
import java.util.*

data class Borrow(

    val student: Student,

    val returnDate: LocalDate
) {
    val id: UUID = UUID.randomUUID()

    val bookList: MutableList<Book> = emptyList<Book>().toMutableList()

    val borrowDate: LocalDate = LocalDate.now()

    init {
        if (returnDate.isBefore(borrowDate)) {
            throw InvalidBorrowReturnDateException("Return date cannot be before borrow date")
        }
    }

    fun addBook(book: Book) {
        if (bookList.size > 2) {
            throw MaxSizeBorrowBooksException("A student cant borrow more than three books at a time")
        }
        bookList.add(book)
    }
}

class InvalidBorrowReturnDateException(message: String) : RuntimeException(message)

class MaxSizeBorrowBooksException(message: String) : RuntimeException(message)
