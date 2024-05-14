class Cliente(var nome: String, var cpf: String, var ano: Int, var mes: Int, var dia: Int){
    fun imprimir(){
        println("Nome: $nome\nCPF: $cpf\nData de nascimento: $dia/$mes/$ano")
    }
}

fun main(){
    val cliente = Cliente("Guilherme", "172.827.828-01", 12, 4, 2006)
    cliente.imprimir()
}
