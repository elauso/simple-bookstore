package net.elau.example.simplebookstore.entity.book

import org.apache.commons.validator.routines.ISBNValidator

data class ISBN10(val value: String) {
    init {
        val isbnValidator = ISBNValidator.getInstance()
        if (!isbnValidator.isValidISBN10(value)) {
            throw InvalidIsbnException("Failed on validate of isbn $value")
        }
    }
}

class InvalidIsbnException(message: String) : RuntimeException(message)
