package net.elau.example.simplebookstore.entity.student

data class Phone(val ddd: String, val number: String) {
    companion object {
        val dddExpression = """^\d{2}${'$'}""".toRegex()

        val numberExpression = """^\d{9}${'$'}""".toRegex()
    }

    init {
        if (!dddExpression.matches(ddd) || !numberExpression.matches(number)) {
            throw InvalidPhoneException("Failed on validate of phone $ddd$number")
        }
    }

    fun getFullNumber() = "$ddd$number"
}

class InvalidPhoneException(message: String) : RuntimeException(message)
