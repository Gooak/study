package backjun

import java.math.BigInteger

fun main(){
    var input = readLine()!!.trim().split(" ")
    var money = BigInteger(input[0])
    var peple = BigInteger(input[1])

    println(money / peple)
    println(money % peple)
}