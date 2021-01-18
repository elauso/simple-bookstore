package net.elau.example.simplebookstore.infra.config

import net.elau.example.simplebookstore.domain.entity.book.BookRepository
import net.elau.example.simplebookstore.domain.entity.student.StudentRepository
import net.elau.example.simplebookstore.domain.usecase.book.list.ListCatalogBookUseCase
import net.elau.example.simplebookstore.domain.usecase.book.register.RegisterCatalogBookUseCase
import net.elau.example.simplebookstore.domain.usecase.student.register.RegisterStudentUseCase
import net.elau.example.simplebookstore.infra.`interface`.db.student.StudentRepositoryJdbcTemplate
import net.elau.example.simplebookstore.infra.db.book.BookRepositoryJdbcTemplate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate

@Configuration
class DependencyConfig {

    @Bean
    fun studentRepository(jdbcTemplate: JdbcTemplate) = StudentRepositoryJdbcTemplate(jdbcTemplate)

    @Bean
    fun bookRepository(jdbcTemplate: JdbcTemplate) = BookRepositoryJdbcTemplate(jdbcTemplate)

    @Bean
    fun registerStudentUseCase(studentRepository: StudentRepository) = RegisterStudentUseCase(studentRepository)

    @Bean
    fun registerCatalogBookUseCase(bookRepository: BookRepository) = RegisterCatalogBookUseCase(bookRepository)

    @Bean
    fun listCatalogBookUseCase(bookRepository: BookRepository) = ListCatalogBookUseCase(bookRepository)
}
