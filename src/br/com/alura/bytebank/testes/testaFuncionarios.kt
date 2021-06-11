import br.com.alura.bytebank.modelos.Analista
import br.com.alura.bytebank.modelos.CalculadoraBonificacao
import br.com.alura.bytebank.modelos.Diretor
import br.com.alura.bytebank.modelos.Gerente

fun testaFuncionarios() {
    val amne = Analista(
        nome = "Amne",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println(
        "O nome do analista é ${amne.nome}, " +
                "corresponde ao cpf ${amne.cpf} e " +
                "recebe R$ ${amne.salario} e recebe R$ ${amne.bonificacao()} de bônus"
    )
    println()

    val juju = Gerente(
        nome = "Jujuzinha",
        cpf = "222.222.222-22",
        salario = 4000.0,
        senha = 1234
    )

    println(
        "O nome do gerente é ${juju.nome}, " +
                "corresponde ao cpf ${juju.cpf} e " +
                "recebe R$ ${juju.salario} e recebe R$ ${juju.bonificacao()} de bônus"
    )

    juju.autentica(1234)
    println()
    val maria = Diretor(
        nome = "Maria",
        cpf = "333.333.333-33",
        salario = 5000.0,
        senha = 3241,
        plr = 300.0
    )

    println(
        "O nome do diretor é ${maria.nome}, " +
                "corresponde ao cpf ${maria.cpf} e " +
                "recebe R$ ${maria.salario} e recebe R$ ${maria.bonificacao()} de bônus"
    )
    maria.autentica(3241)
    println()
    val renata = Analista(
        nome = "Renata",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    println(
        "O nome do analista é ${renata.nome}, " +
                "corresponde ao cpf ${renata.cpf} e " +
                "recebe R$ ${renata.salario} e recebe R$ ${renata.bonificacao()} de bônus"
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(juju)
    calculadora.registra(amne)
    calculadora.registra(maria)

    println("O total de bonificações foi de R$ ${calculadora.total}")
}