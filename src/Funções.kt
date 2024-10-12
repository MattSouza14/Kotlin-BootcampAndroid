//Sem parametros e retorno
fun Impressao(){
    println("Oi")
}
//Com parametros e retorno v
fun Soma(a: Int, b:Int): Int{
    return a+b
}
//Com parametros e sem retorno
fun Sub(a:Int, b:Int){
    println("Total da sub é ${a - b}")
}
fun main(){
    Impressao()
  var x = 10
  var y = 20
    print(Soma(x,y))
    Sub(x,y)
    Casa()
}

//Chamadas de função

fun Casa(){
    println("Entrando na casa")
    Quarto()
}
fun Quarto(){
    println("Entrando no quarto")
    GuardaRoupa()
}
fun GuardaRoupa(){
    println("Abrindo o guarda-roupa")
    Sapato()
}
fun Sapato(){
    println("Escolhendo um sapato")

}