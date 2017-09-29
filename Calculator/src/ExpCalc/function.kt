package Caluculator.function

fun addition(a:Int, b:Int) :Int{
    return a+b
}
fun multiplication(a:Int, b:Int):Int{
    return a*b
}

fun substraction(a:Int, b:Int):Int{
    return a-b
}

fun division(a: Float, b: Float):Float{
    return a/b
}

fun pow( a: Double,  b: Int): Double {
    var result:Double = 1.0
    for(i in 1..b)
        result = result*a
    return result
}

fun fact( a: Int): Double {
    var result:Double = 1.0
    for(i in a downTo 1)
        result = result*i
    return result
}

fun exp( x: Double): Double{
    var result:Double = 0.0
    for(n in 0..40){
        val anterior = result
        result = result+(pow(x,n)/fact(n))
        if (anterior == result) break
    }
    return result
}

fun sin( x: Double): Double{
    var result:Double = 0.0
    for(n in 0..40){
        val anterior = result
        result = result+(pow(-1.0,n)/fact(2*n+1)*pow(x,2*n+1))
        if (anterior == result) break
    }
    return result
}

fun cos( x: Double): Double{
    var result:Double = 0.0
    for(n in 0..40){
        val anterior = result
        result = result+(pow(-1.0,n)/fact(2*n)*pow(x,2*n))
        if (anterior == result) break
    }
    return result
}

fun tan(x: Double): Double{

    val result: Double= cos(x)/sin(x)
    return result
}