import java.io.File
import java.util.Scanner

fun main() {
    val s = readln()
    var num = readln()?.toInt() ?: 0
    var num2 = readlnOrNull()?.toInt() ?: 0
    var num3 = readlnOrNull()?.toDouble()?: 0
    var num4 = readlnOrNull()?.toFloat()?: 0.0f
    var num5 = readlnOrNull()?.toBoolean()?: false

    println(num)
    println(num2)
   println(num3)
    println(num4)
    println(num5)
//Usando java
    val sc = Scanner(System.`in`)
    val nume =sc.nextInt()
    println(nume)


}

