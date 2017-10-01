package Caluculator2.main

fun main(args: Array<String>) {
    try {

        do {
            println("Enter a Expression:")
            val str = readLine()
            val delimiters = arrayOf("+", "-", "*", "/")
            var found = "Not found"
            var s: Int = 0
            var splited: List<String> = listOf()
            for (delimiter in delimiters) {
                splited = str!!.split(delimiter)
                if (splited[0] != str) {
                    found = delimiter
                    when (found) {
                        "+" -> s = splited[0].toInt() + splited[1].toInt()
                        "-" -> s = splited[0].toInt() - splited[1].toInt()
                        "*" -> s = splited[0].toInt() * splited[1].toInt()
                        "/" -> s = splited[0].toInt() / splited[1].toInt()
                        else -> println("Invalid Operator!")
                    }
                    break
                }
            }
            println("${splited[0]} ${found} ${splited[1]} = " + s)
        } while (str != "quit")
    }
    catch (e: java.lang.IndexOutOfBoundsException){
    println("Exiting")
    }
}