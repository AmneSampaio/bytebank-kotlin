package br.com.alura.bytebank.modelos

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){
    override fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else println("Saldo insuficiente. Verifique o saldo atual.")
    }
}