package backjun

fun main(){
    var numMap = mapOf<Int, String>(0 to "zero", 1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five", 6 to "six", 7 to "seven", 8 to "eight", 9 to "nine")
    var (n, m) = readln().split(" ").map { it.toInt() }
    var result  = mutableMapOf<Int, String>()

    for(i in n..m){
        if(i.toString().length == 1){
            result.put(i, numMap.get(i).toString())
        } else{
            var numText = ""
            var list = i.toString().toMutableList()
            for(j in 0 until list.size){
                numText += "${numMap.get(list[j].toString().toInt())} "
            }
            result.put(i, numText)
        }
    }
    var entries = result.entries.sortedBy { it.value }
    var i = 1
    for (entry in entries){
        if(i % 10 == 0 && i != 0){
            println("${entry.key}")
        }else{
            print("${entry.key} ")
        }
        i++
    }
}

//map으로 만들어서 String을 묶어둔 다음 길이가 두개일때 list화 해서 텍스트를 +=해서 맞춰준다. 그 이후 result는 value값을 기준으로 정렬하여 10개씩 끊어서 출력하였다.

//문제
//79를 영어로 읽되 숫자 단위로 하나씩 읽는다면 "seven nine"이 된다. 80은 마찬가지로 "eight zero"라고 읽는다. 79는 80보다 작지만, 영어로 숫자 하나씩 읽는다면 "eight zero"가 "seven nine"보다 사전순으로 먼저 온다.
//
//문제는 정수 M, N(1 ≤ M ≤ N ≤ 99)이 주어지면 M 이상 N 이하의 정수를 숫자 하나씩 읽었을 때를 기준으로 사전순으로 정렬하여 출력하는 것이다.
//
//입력
//첫째 줄에 M과 N이 주어진다.
//
//출력
//M 이상 N 이하의 정수를 문제 조건에 맞게 정렬하여 한 줄에 10개씩 출력한다.
