package net.elau.example.simplebookstore.`interface`.controller.student.register

import net.elau.example.simplebookstore.entity.student.Course
import net.elau.example.simplebookstore.usecase.student.register.RegisterStudentDto
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class RegisterStudentRequest(

    @NotBlank
    val name: String? = null,

    @NotNull
    val registration: Long? = null,

    @NotNull
    val course: Course? = null,

    @NotNull
    val email: String? = null,

    @NotNull
    val phoneDDD: String? = null,

    @NotNull
    val phoneNumber: String? = null
) {

    fun buildRegisterStudentDto() =
        RegisterStudentDto(name!!, registration!!, course!!, email!!, phoneDDD!!, phoneNumber!!)
}
