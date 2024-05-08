package backjun

fun main(){
    var input = readLine()!!.split(" ")

    var index1 = input[0].toInt()
    var index2 = input[1].toInt()



    println(min(index1, index2))
    println((index1 * index2) / min(index1, index2))
}

fun min(a: Int, b: Int): Int {
    var r = 0
    var a = a
    var b = b
    while(b != 0){
        r = a % b
        a = b
        b = r
    }
    return a
}
// 최대 공약수는 큰 숫자에 낮은숫자를 나누어 나머지로, 낮은숫자 나머지로 계속 나눈다 0으로 떨어질때 가장 낮았던 숫자가 최대 공약수 이다.
// 최대 공약수를 먼저 구한 후 index1과 index2를 곱한 후 최대공약수를 나누면 최소공배수가 나타난다


//문제
//두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
//
//출력
//첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.