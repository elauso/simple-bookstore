package net.elau.example.simplebookstore.`interface`.config

import net.elau.example.simplebookstore.entity.student.StudentRepository
import net.elau.example.simplebookstore.usecase.student.register.RegisterStudentUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCaseDependencyConfig {

    @Bean
    fun registerStudentUseCase(studentRepository: StudentRepository) = RegisterStudentUseCase(studentRepository)
}
