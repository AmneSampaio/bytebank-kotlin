import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val amne = Cliente(nome = "Amne", cpf = "", senha = 1)
    val maria = Cliente(nome = "Maria", cpf = "", senha = 2)
    val contaAmne = ContaCorrente(amne, 300)
    var contaMaria = ContaPoupanca(maria, 400)
    println("titular conta amne: ${contaAmne.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaAmne)
    println(contaMaria)
}