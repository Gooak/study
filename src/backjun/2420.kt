package backjun

import kotlin.math.abs

fun main(){
    var (a, b) = readln().split(" ").map { it.toLong() }

    print(abs(a-b))
}