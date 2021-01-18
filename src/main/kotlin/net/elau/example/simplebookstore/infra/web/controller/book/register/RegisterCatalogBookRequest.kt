package net.elau.example.simplebookstore.infra.web.controller.book.register

import net.elau.example.simplebookstore.domain.entity.book.Genre
import net.elau.example.simplebookstore.domain.entity.book.Language
import net.elau.example.simplebookstore.domain.usecase.book.register.RegisterCatalogBookDto
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class RegisterCatalogBookRequest(

    @NotBlank
    val name: String? = null,

    @NotBlank
    val isbn10: String? = null,

    @NotBlank
    val isbn13: String? = null,

    @NotNull
    val genre: Genre? = null,

    @NotBlank
    val publisher: String? = null,

    @NotNull
    val paperback: Int? = null,

    @NotNull
    val language: Language? = null
)

fun RegisterCatalogBookRequest.buildRegisterCatalogBookDto() =
    RegisterCatalogBookDto(name!!, isbn10!!, isbn13!!, genre!!, publisher!!, paperback!!, language!!)
