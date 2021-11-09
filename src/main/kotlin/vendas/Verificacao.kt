package vendas

class Verificacao {

    fun login(usuario: String, senha: String){
        if(senha == "GeekGamer459"){
            println("login efetuado com sucesso!")
        }else{
            throw Exception("A senha está incorreta")
        }
    }

}