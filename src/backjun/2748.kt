package backjun

import java.util.Scanner

fun main(){
    var input = readLine()!!.toInt()
    print(function(input))
}

fun function(n: Int): Long {
    if (n <= 1) return n.toLong()
    val fibs = LongArray(n + 1)
    fibs[2] = 1
    fibs[1] = 1
    fibs[0] = 0
    for (i in 3..n) {
        fibs[i] = fibs[i - 1] + fibs[i - 2]
    }
    return fibs[n]
} //메모이제이션을 쓴 방법

//기본 방법으로 썼더니 시간초과가 떠서 메모이제이션 방법을 썼다.. 그러더니 해결

//fun function(n : Int): Int {
//    if(n == 0) return 0
//    else if (n <=1) return 1;
//    return function(n-1) + function(n-2)
//} --일반 재기함수는 O(n2)속도

