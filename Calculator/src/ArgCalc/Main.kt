package Caluculator2.main


fun main(args: Array<String>) {
    do {
    println("Enter a Expression:")
    val str:String = readLine()!!
        var list = str.split(" ")
        var s:Int = 0
        val oper: String = list[1]
       // println(list)
      when (oper) {
          "+" -> s = list[0].toInt() + list[2].toInt()
          "-" -> s = list[0].toInt() - list[2].toInt()
          "*" -> s = list[0].toInt() * list[2].toInt()
          "/" -> s = list[0].toInt() / list[2].toInt()
          else ->  println("Invalid Operator!")
      }
        println("${list[0]} ${list[1]} ${list[2]} = ${s}")

    } while (str=="quit")

}