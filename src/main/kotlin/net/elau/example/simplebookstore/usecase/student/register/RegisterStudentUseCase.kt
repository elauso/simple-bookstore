package net.elau.example.simplebookstore.usecase.student.register

import net.elau.example.simplebookstore.entity.student.StudentRepository

class RegisterStudentUseCase(private val studentRepository: StudentRepository) {

    fun register(registerStudentDto: RegisterStudentDto) {
        val student = registerStudentDto.buildStudent()
        studentRepository.register(student)
    }
}
