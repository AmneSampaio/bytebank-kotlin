import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.Conta
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca

fun testaContasDiferentes(){

    val amne = Cliente(nome = "Amne", cpf = "", senha = 1)
    val maria = Cliente(nome = "Maria", cpf = "", senha = 2)
    val contaCorrente = ContaCorrente(
        titular = amne,
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = maria,
        numero = 2000
    )

    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(2000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaPoupanca.saca(100.0)
    contaCorrente.saca(200.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    println("total ${Conta.total}")
}