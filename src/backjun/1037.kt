package backjun

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)
    val number = input.nextInt()
    if(number > 50) return
    val numberList = ArrayList<Int>()

    repeat(number){
        numberList.add(input.nextInt())
    }

    numberList.sort()
    println(numberList.last() * numberList[0])

}

//입력한 값의 약수 구하는 알고리즘
//해당 약수값들의 가장 큰값의 가장 작은 값을 곱해 나온 값이 약수이다.
// 2 * 4 = 8