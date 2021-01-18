package net.elau.example.simplebookstore.infra.`interface`.web.controller.student.register

import net.elau.example.simplebookstore.domain.entity.student.Course
import net.elau.example.simplebookstore.domain.usecase.student.register.RegisterStudentDto
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class RegisterStudentRequest(

    @NotBlank
    val name: String? = null,

    @NotNull
    val registration: Long? = null,

    @NotNull
    val course: Course? = null,

    @NotBlank
    val email: String? = null,

    @NotBlank
    val phoneDDD: String? = null,

    @NotBlank
    val phoneNumber: String? = null
)

fun RegisterStudentRequest.buildRegisterStudentDto() =
    RegisterStudentDto(name!!, registration!!, course!!, email!!, phoneDDD!!, phoneNumber!!)