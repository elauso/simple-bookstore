package net.elau.example.simplebookstore.`interface`.config

import net.elau.example.simplebookstore.`interface`.db.student.StudentRepositoryJdbcTemplate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate

@Configuration
class EntityDependencyConfig {

    @Bean
    fun studentRepository(jdbcTemplate: JdbcTemplate) = StudentRepositoryJdbcTemplate(jdbcTemplate)
}
