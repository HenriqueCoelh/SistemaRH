package vendas
import java.util.HashMap

class Gerente (nome: String, sobrenome: String, ra: Int, idade: Int,
               diasTrabalhados: Int, diasDeFeriasTirados: Int, salario: Double,
               anosTrabalhados: Int):

    Funcionario(nome, sobrenome, ra, idade,
        diasTrabalhados, diasDeFeriasTirados, salario,
        anosTrabalhados) {

    val equipeVendas = hashMapOf<Int, Representante>()

    fun addRepresentante( representante: Representante) {
        equipeVendas.put(representante.ra, representante)
    }

    fun calculateComissao(){
        var numVendas = 0.0
        if(equipeVendas.isEmpty()){
            println("Não há representantes de vendas na equipe")
        }else{
            for (item in equipeVendas){
                numVendas += item.value.vendasFeitas
            }
            val comissao = 0.03 * numVendas

            println("A comissão geral, com base nas vendas realizadas pela equipe " +
                    "foi de R$$comissao")
        }
    }

        }