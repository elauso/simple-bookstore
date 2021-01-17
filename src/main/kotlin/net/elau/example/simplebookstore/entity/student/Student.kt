package net.elau.example.simplebookstore.entity.student

data class Student(

    val name: String,

    val registration: Long,

    val course: Course,

    val email: Email,

    val phone: Phone
)
