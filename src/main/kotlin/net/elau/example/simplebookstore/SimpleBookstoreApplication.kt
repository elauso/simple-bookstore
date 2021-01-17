package net.elau.example.simplebookstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleBookstoreApplication

fun main(args: Array<String>) {
	runApplication<SimpleBookstoreApplication>(*args)
}
