class ContaCorrente (var numeroConta: Int, var saldo: Double){
    fun imprimir(){
        println("Conta: $numeroConta \nSaldo: $saldo")
    }
    
    fun depositar(Valor: Double){
        saldo = saldo + Valor
    }
    
    fun sacar(Valor: Double){
        saldo = saldo - Valor
    }
    
    fun main(){
        var contaDois = ContaCorrente( 306 , 1758.96 )
        contaDois.imprimir()
    }
}
