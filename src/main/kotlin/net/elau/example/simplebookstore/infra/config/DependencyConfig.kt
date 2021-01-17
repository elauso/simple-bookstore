package net.elau.example.simplebookstore.infra.config

import net.elau.example.simplebookstore.domain.entity.student.StudentRepository
import net.elau.example.simplebookstore.domain.usecase.student.register.RegisterStudentUseCase
import net.elau.example.simplebookstore.infra.`interface`.db.student.StudentRepositoryJdbcTemplate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate

@Configuration
class DependencyConfig {

    @Bean
    fun studentRepository(jdbcTemplate: JdbcTemplate) = StudentRepositoryJdbcTemplate(jdbcTemplate)

    @Bean
    fun registerStudentUseCase(studentRepository: StudentRepository) = RegisterStudentUseCase(studentRepository)
}
