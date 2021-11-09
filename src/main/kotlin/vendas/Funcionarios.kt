package vendas

import kotlin.math.min

open class Funcionario(var nome: String, var sobrenome: String, var ra: Int, var idade: Int,
                   var diasTrabalhados: Int, var diasDeFeriasTirados: Int, var salario: Double,
                   var anosTrabalhados: Int){

    fun tempoParaAposentadoria(): Int {
        return min(60 - idade, 40 - anosTrabalhados)
    }

    fun tempoRestanteFerias(): Int {
        return ((diasTrabalhados/360) * (30 - diasDeFeriasTirados))
    }

    fun calcularBonus(): Double {
       return (2.2 * salario)
    }

}