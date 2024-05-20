package backjun

import java.math.BigInteger

fun main(){
    var (A,B) = readln().split(" ").map { it.toLong() }
    var result : Long = if(A < B){
        (B * (B + 1)) / 2 -(A * (A - 1) / 2)
    } else{
        (A * (A + 1)) / 2 -(B * (B - 1) / 2)
    }
    print(result)
}