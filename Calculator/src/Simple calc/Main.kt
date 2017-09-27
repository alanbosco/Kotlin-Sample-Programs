package Caluculator.main

import Caluculator.function.*

fun main(args: Array<String>) {
    println("Enter a Number:")
    val a:String = readLine()!!
    println("Enter the Operator:")
    val fn:String = readLine()!!
    println("Enter a Number:")
    val b:String = readLine()!!

    when (fn){
        "+" -> println("Sum of ${a} and ${b} is equal to: ${addition(a.toInt(),b.toInt())}")
        "-" -> println("Difference of ${a} and ${b} is equal to: ${substraction(a.toInt(),b.toInt())}")
        "*" -> println("Product of ${a} and ${b} is equal to: ${multiplication(a.toInt(),b.toInt())}")
        "/" -> println("Quotient of ${a} and ${b} is equal to: ${division(a.toFloat(),b.toFloat())}")
        else -> {
            println("Invalid Operator!")
        }

    }
}