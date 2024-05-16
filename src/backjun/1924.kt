package backjun

fun main(){
    var (M, D) = readln().split(" ").map { it.toInt() }

    var maps = mapOf<Int, Int>(1 to 31, 2 to 28, 3 to 31, 4 to 30, 5 to 31, 6 to 30, 7 to 31, 8 to 31, 9 to 30, 10 to 31, 11 to 30, 12 to 31 )
    var list = listOf<String>("MON", "TUS", "WED", "THU", "FRI", "SAT", "SUN")

    var resultDay = ""

    var month = maps.keys.toMutableList()
    var days = maps.values.toMutableList()
    var DAY = 0

    for(i in 0..month.size-1){
        for(j in 0..days[i]-1){
            print("${month[i]} ${j+1} ${list[DAY]}\n")
            if(j+1 == D && month[i] == M){
                resultDay = list[DAY]
                break
            }
            DAY++
            if(DAY == 7){
                DAY = 0
            }
        }

    }

    print(resultDay)

}

// 무식한 방법으로 구했다. 1월 1일이 월요일인걸 알면 그냥 그대로 다음날 화요일 이런식으로 해서 했다..

//문제
//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
//
//출력
//첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.