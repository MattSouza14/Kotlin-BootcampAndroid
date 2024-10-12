fun main() {
    a(10)
    b()

}
             //Aceita qualquer tipo de variavel
fun a(valor: Any){
    println("Mostrando o valor ${valor}")
}
        // = a void
fun b():Unit{
    println("Sem retorno")
}

