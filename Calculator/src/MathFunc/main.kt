package MathFunc

import Caluculator.function.*

fun main(args: Array<String>) {
    do {

 println("Enter the expression:")
 val str = readLine()
val l:List<String> = str!!.split(" ")
when (l[0]){
    "pow" -> println(pow(l[1].toDouble(),l[2].toInt()))
    "fact" -> println(fact(l[1].toInt()))
    "exp" -> println(exp(l[1].toDouble()))
    "sin" -> println(sin(l[1].toDouble()))
    "cos" -> println(cos(l[1].toDouble()))
    "tan" -> println(tan(l[1].toDouble()))
    "quit" -> println("Exiting")
    else -> println("Invalid Operation")
}
    } while (l[0]!="quit")
}


