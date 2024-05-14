class Retangulo(var altura: Double, var base: Double){
    fun calcularArea(){
        println(base * altura)
    }
    
    fun calcularPerimetro(){
        println(base*2 + altura*2)
    }
}

fun main(){
    val retanguloUm = Retangulo(3.0, 5.0)
    
   retanguloUm.calcArea()
   retanguloUm.calcPerimetro()
}
