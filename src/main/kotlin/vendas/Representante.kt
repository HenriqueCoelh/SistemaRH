package vendas

open class Representante(nome: String, sobrenome: String, ra: Int, idade: Int,
                    diasTrabalhados: Int, diasDeFeriasTirados: Int, salario: Double,
                    anosTrabalhados: Int, var vendasFeitas: Double):

    Funcionario(nome, sobrenome, ra, idade,
        diasTrabalhados, diasDeFeriasTirados, salario,
        anosTrabalhados) {


    fun calculateComission(): Double {
        return (0.1 * vendasFeitas)

    }

}




