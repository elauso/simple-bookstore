package net.elau.example.simplebookstore.`interface`.controller.student.register

import net.elau.example.simplebookstore.usecase.student.register.RegisterStudentUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class RegisterStudentEndpoint(private val registerStudentUseCase: RegisterStudentUseCase) {

    @PostMapping("/api/students")
    fun register(@Valid @RequestBody registerStudentRequest: RegisterStudentRequest) {
        val registerStudentDto = registerStudentRequest.buildRegisterStudentDto()
        registerStudentUseCase.register(registerStudentDto)
    }
}
