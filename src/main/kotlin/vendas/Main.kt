package vendas

    fun main(args: Array<String>) {

    val luana = Representante(
        "Luana", "Souza", 123,
        20, 15, 23,
        2800.00, 4, 700.0)

    val pedro = Representante(
        "Pedro", "Henrique", 123,
        20, 15, 23,
        2800.00, 4, 700.0)

    val vilma = Gerente(
        "Vilma", "Oliveira", 123,
        20, 15, 23,
        2800.00, 7)

        println("Informações Luana")
        println(luana.tempoParaAposentadoria())
        println(luana.tempoRestanteFerias())
        println(luana.calcularBonus())






    }