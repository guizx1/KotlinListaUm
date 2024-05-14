class Calculadora(){
    fun somar(a: Int, b: Int){
        println(a + b)
    }
    
    fun subtrair(a: Int, b: Int){
        println(a - b)
    }
    
    fun multiplicar(a: Int, b: Int){
        println(a * b)
    }
    
    fun dividir (a: Int, b: Int){
        println(a/b)
    }
}

fun main(){
    val calcular = Calculadora()
    
    calcular.somar(3,7)
    calcular.subtrair(10, 2)
    calcular.multiplicar(5, 2)
    calcular.dividir(20,2)
}
