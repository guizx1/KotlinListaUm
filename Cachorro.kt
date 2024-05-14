class Cachorro(var nome: String, var raca: String, var idade: String){
    fun latir(){
        println("Au au!")
    }
}
fun main(){
   val cachorroUm = Cachorro("Beethoven", "Vira-lata", “2 anos”)
   cachorroUm.latir()
}
