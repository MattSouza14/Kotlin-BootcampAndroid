//Introdução
class  Pessoa(val ano_nasc:Int, var nome:String){
    var idade = 2024 - ano_nasc
    fun saudacao(){
        println("Olá ${this.nome}")
    }
}
//
fun main(){
    var Pessoa = Pessoa(2000, "Mateus")
    println(Pessoa.nome)
    Pessoa.saudacao()
    println(Pessoa.idade)
}
