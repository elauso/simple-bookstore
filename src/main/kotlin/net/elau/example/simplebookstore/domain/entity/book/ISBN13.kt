package net.elau.example.simplebookstore.domain.entity.book

import org.apache.commons.validator.routines.ISBNValidator

data class ISBN13(val value: String) {
    init {
        val isbnValidator = ISBNValidator.getInstance()
        if (isbnValidator.isValidISBN13(value)) {
            throw InvalidIsbnException("Failed on validate of isbn $value")
        }
    }
}
