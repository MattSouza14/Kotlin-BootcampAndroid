fun main() {
//Estruturas de decisão
    //IF
    var idade: Int = 18
    if (idade >= 18 && idade <= 39){
        println("Idade entre 18 e 39")
    }
    else if(idade >= 40 &&  idade <= 50){
        println("Idade entre 40 e 50 anos")
    }
    else if (idade > 50){
        println("Idade maior que 50")
    }
    else {
        println("É menor de idade")
    }
    //WHEN
    var cargo: String = "Gerente"
        when (cargo){
            "Presidente" -> println(6000f)
            "Gerente" -> println(5000f)
            "Analista" -> println(4000f)
            "Estagiario" -> println(600f)
            else -> println("Sem cargo")
        }


//Estruturas de repetição
    //For
    for (i in 1 .. 10){
        println("${i} ")
    }

    println("\n")

    for (i in 10 downTo  1){
        println("${i} ")
    }

    val str = "Criação de aplicativos android"
    for (i in str){
        println("${i} ")
    }


    for (i in 1 .. 20 step 2){
        println("${i} ")
    }
    //While
    var i = 0
    while(i<10){
        println(i)
        i++
    }
    var j = 0
    while (j < str.length){
       println(j)
        j++
    }

    do {
        println("Digite seu nome")
        val value = readln()
    }while (value =="")
//Break força uma parada
//Continue ignora
//
}
