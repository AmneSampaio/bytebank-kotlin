package br.com.alura.bytebank.modelos

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){

    override fun bonificacao(): Double {
        return salario*0.1
    }

}
