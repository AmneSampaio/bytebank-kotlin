fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("conta é positiva")
        }
        saldo == 0.0 -> {
            println("conta está vazia")
        }
        else -> {
            println("conta é negativa")
        }
    }
}