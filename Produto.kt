class Produto(var nome: String, var preco: Double, var quantidade: Int){
    fun tudo(){
        println(preco * quantidade)
    }
}
fun main(){
   val produtoUm = Produto("bolacha", 2.50, 4)
   produtoUm.tudo()
}
