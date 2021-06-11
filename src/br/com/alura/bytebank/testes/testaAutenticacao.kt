import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.Diretor
import br.com.alura.bytebank.modelos.Gerente
import br.com.alura.bytebank.modelos.SistemaInterno

fun testaAutenticação() {
    val gerente = Gerente(
        nome = "Julia",
        cpf = "111.111.111-11",
        salario = 3000.0,
        senha = 2456
    )

    val diretora = Diretor(
        nome = "Amne",
        cpf = "222.222.222-22",
        salario = 5000.0,
        senha = 5896,
        plr = 500.0
    )

    val cliente = Cliente(
        nome = "Maria",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 2456)
    sistema.entra(diretora, 5896)
    sistema.entra(cliente, 1234)

}
