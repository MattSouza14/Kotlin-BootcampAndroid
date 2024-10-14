class  Animal_(var especie: String) {
    var fala: String = ""
init {
    fala = if(especie.lowercase() == "cachorro"){
        "auau"
    }else if(especie.lowercase() == "gato"){
        "miaumiua"
    }else{
        ""
    }
}
    init {
        println(fala)
    }
}


class Robo{
    lateinit var nome:String
    fun ligar(){
        nome = "Iniciando o robo"
    }
    fun inicio_tardio(){
        if(!this::nome.isInitialized){
            nome = "Inicio tardio"
            println(nome)
        }
    }
}


fun main() {
    val animal = Animal_("cachorro")
    var bot:Robo = Robo()
    println(bot.ligar())

}