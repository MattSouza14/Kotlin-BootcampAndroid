fun main() {
    val numerador = 10
    val denominador = 0
//Bloco try catch
    //Trata o erro e executa o resto do codigo
    try {
        val res = numerador / denominador
        println(res)
    }catch (e: ArithmeticException){
        println("Erro: Não existe divisão por 0")
    }finally {
        //É executado independente do que acontece
    println("oi")
    }
}