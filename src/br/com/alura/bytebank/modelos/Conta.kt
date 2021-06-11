package br.com.alura.bytebank.modelos

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

     fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}

