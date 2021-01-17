package net.elau.example.simplebookstore.domain.entity.student

import org.apache.commons.validator.routines.EmailValidator

data class Email(val value: String) {
    init {
        val emailValidator = EmailValidator.getInstance()
        if (!emailValidator.isValid(value)) {
            throw InvalidEmailException("Failed on validate of e-mail $value")
        }
    }
}

class InvalidEmailException(message: String) : RuntimeException(message)
