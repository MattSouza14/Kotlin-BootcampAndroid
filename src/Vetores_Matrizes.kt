//Vetores
fun vetInt(){
                  //vetor de inteiros
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 0 .. (numeros.size - 1)){
        println("${numeros[i]} ")
    }
    //Outros tipos
    //var vetorFloat = floatArrayOf(1.5f,2.7f,5.2f)
    //var vetorBoolean = booleanArrayOf(true, false, true)
    //var charVetor = charArrayOf('a','b','c')
}

fun main(){
vetInt()

//Matrizes
    //Matriz de Int
    val linhas = 3
    val colunas = 3
        val matriz: Array<Array<Int>> = Array(linhas) {Array(colunas) {0} }
var digito = 1
    for (i in 0 until linhas  ) {
        for (j in 0 until colunas){
            matriz[i][j] = digito++
            print("${matriz[i][j]} ")
        }
        println()
    }

    //Matriz com char
        val matrizLetra: Array<Array<Char>> = Array(linhas) {Array(colunas) {' '} }
    var c = 'a'
    for (i in 0 until linhas  ) {
        for (j in 0 until colunas){
            matrizLetra[i][j] = c
            c++
            print("${matrizLetra[i][j]} ")
        }
        println()
    }
}


