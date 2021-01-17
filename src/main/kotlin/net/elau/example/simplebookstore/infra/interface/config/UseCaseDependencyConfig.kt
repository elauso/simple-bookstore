package net.elau.example.simplebookstore.infra.`interface`.config

import net.elau.example.simplebookstore.domain.entity.student.StudentRepository
import net.elau.example.simplebookstore.domain.usecase.student.register.RegisterStudentUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCaseDependencyConfig {

    @Bean
    fun registerStudentUseCase(studentRepository: StudentRepository) = RegisterStudentUseCase(studentRepository)
}
