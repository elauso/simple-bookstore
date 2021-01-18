package net.elau.example.simplebookstore.domain.usecase.student.register

import net.elau.example.simplebookstore.domain.entity.student.Course
import net.elau.example.simplebookstore.domain.entity.student.Email
import net.elau.example.simplebookstore.domain.entity.student.Phone
import net.elau.example.simplebookstore.domain.entity.student.Student

data class RegisterStudentDto(

    val name: String,

    val registration: Long,

    val course: Course,

    val email: String,

    val phoneDDD: String,

    val phoneNumber: String
)

fun RegisterStudentDto.buildStudent() = Student(name, registration, course, Email(email), Phone(phoneDDD, phoneNumber))