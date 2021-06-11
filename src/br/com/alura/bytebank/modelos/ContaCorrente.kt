package br.com.alura.bytebank.modelos

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa
        } else println("Saldo insuficiente. Verifique o saldo atual.")

    }
}