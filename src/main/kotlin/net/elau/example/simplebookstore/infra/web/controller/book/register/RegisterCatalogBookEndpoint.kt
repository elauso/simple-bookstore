package net.elau.example.simplebookstore.infra.web.controller.book.register

import net.elau.example.simplebookstore.domain.usecase.book.register.RegisterCatalogBookUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class RegisterCatalogBookEndpoint(private val registerCatalogBookUseCase: RegisterCatalogBookUseCase) {

    @PostMapping("/api/books")
    fun register(@Valid @RequestBody registerCatalogBookRequest: RegisterCatalogBookRequest) {
        val registerCatalogBookDto = registerCatalogBookRequest.buildRegisterCatalogBookDto()
        registerCatalogBookUseCase.register(registerCatalogBookDto)
    }
}
