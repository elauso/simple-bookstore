package net.elau.example.simplebookstore.usecase.student.register

import net.elau.example.simplebookstore.entity.student.Course
import net.elau.example.simplebookstore.entity.student.Email
import net.elau.example.simplebookstore.entity.student.Phone
import net.elau.example.simplebookstore.entity.student.Student

data class RegisterStudentDto(

    val name: String,

    val registration: Long,

    val course: Course,

    val email: String,

    val phoneDDD: String,

    val phoneNumber: String
) {

    fun buildStudent() = Student(name, registration, course, Email(email), Phone(phoneDDD, phoneNumber))
}
