fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular = "Amne $i"
        val numeroConta = 1000 + i
        var saldo = 10.0 * i
        saldo -= 10.0
        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()

        testaCondicoes(saldo)
    }
}