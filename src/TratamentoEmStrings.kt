fun main() {
    //NullSafety
    var str: String? = null
    println(str?.length) //O kotlin identifica e assume o tratamento do erro
    println(str!!.length) //Eu assumo o erro

    //Elvis -> lembra o operador ternario
    //str = "Mateus"
    println(str ?: "nula")


    //Função let
    var str1: String? = null
    //str1 = "Mateus"
    str1.let {
        println("Caiu na função LET")
    }
}