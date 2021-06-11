import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca

fun testaComportamentosConta() {

    val julia = Cliente(nome = "Julia", cpf = "", senha = 1)
    val helena = Cliente(nome = "Helena", cpf = "", senha = 2)
    var contaJulia = ContaCorrente(julia, 100)
    var contaHelena = ContaPoupanca(helena, 200)

    contaJulia.deposita(200.0)
    println("O titular da conta ${contaJulia.numero} é ${contaJulia.titular} e o saldo é R$ ${contaJulia.saldo}")
    println("Depositando na conta da ${contaJulia.titular}")
    contaJulia.deposita(100.0)
//    contaJulia.getSaldo() += 50.0
    println("O novo saldo é R$ ${contaJulia.saldo}")
    println("Sacando da conta da ${contaJulia.titular}")
    contaJulia.saca(10.0)
    println("O novo saldo é R$ ${contaJulia.saldo}")
    println()
    contaHelena.deposita(100.0)
    println("O titular da conta ${contaHelena.numero} é ${contaHelena.titular} e o saldo é R$ ${contaHelena.saldo}")
    println("Depositando na conta da ${contaHelena.titular}")
    contaHelena.deposita(200.0)
//    contaHelena.getSaldo() += 60.0
    println("O novo saldo é R$ ${contaHelena.saldo}")
    println("Sacando da conta da ${contaHelena.titular}")
    contaHelena.saca(10.0)
    // contaHelena.saca(400.0 )
    println("O novo saldo é R$ ${contaHelena.saldo}")
    println()
    println("Transferencia da conta da ${contaJulia.titular} para a conta da ${contaHelena.titular}")

    if (contaJulia.transfere(100.0, contaHelena)) {
        println("Transferido com sucesso")
    } else {
        println(
            "Falha na transferencia. " +
                    "Valor informado é superior ao saldo da conta de origem"
        )
    }

    println("Julia ${contaJulia.saldo}")
    println("Helena ${contaHelena.saldo}")
}