package net.elau.example.simplebookstore.`interface`.db.student

import net.elau.example.simplebookstore.entity.student.Student
import net.elau.example.simplebookstore.entity.student.StudentRepository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource
import org.springframework.stereotype.Repository

@Repository
class StudentRepositoryJdbcTemplate(private val jdbcTemplate: JdbcTemplate) : StudentRepository {

    override fun register(student: Student) {
        val sql = "insert into students(name,registration,course,email,phone) values(?,?,?,?,?)"
        jdbcTemplate.update(sql, *arrayOf<Any>(student.name, student.registration, student.course.name, student.email.value, student.phone.getFullNumber()))
    }
}
