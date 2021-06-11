package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua dos Andradas",
        complemento = "conxinchina",
        cep = "00000-000"
    )

    val endereco2 = endereco.copy(logradouro = "Avenida das Flores")

    println(endereco.equals(endereco2))

    println(endereco.hashCode())
    println(endereco2.hashCode())

    println(endereco)
    println(endereco2)
}