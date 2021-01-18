package net.elau.example.simplebookstore.infra.web.controller.book.list

import net.elau.example.simplebookstore.domain.usecase.book.list.ListCatalogBookUseCase
import net.elau.example.simplebookstore.domain.usecase.book.list.buildListCatalogBookResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ListCatalogBookEndpoint(private val listCatalogBookUseCase: ListCatalogBookUseCase) {

    @GetMapping("/api/books")
    fun list(@RequestParam(required = false) name: String?) =
        listCatalogBookUseCase.list(name).map { it.buildListCatalogBookResponse() }
}
