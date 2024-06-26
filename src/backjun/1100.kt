package backjun

fun main(){
    var chessOne = listOf<Boolean>(true,false,true,false,true,false,true,false)
    var chessTwo = chessOne.reversed()
    var i = 2
    var result = 0
    repeat(8){
        var list = readln().toList()
        if(i % 2 == 0){
         for(i in 0 until list.size){
             if(list[i] == 'F' && chessOne[i] == true){
                 result++
             }
         }
        } else{
            for(i in 0 until list.size){
                if(list[i] == 'F' && chessTwo[i] == true){
                    result++
                }
            }
        }
        i++
    }
    println(result)
}

//흰색을 true 검은색을 false로 하여 F와 true를 만족할때에 result 숫자를 올리는걸 선택했다.
//i를 2로주어 나머지가 0이면 chessOne 1이면 chessTwo로 히였다

//문제
//체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.
//
//출력
//첫째 줄에 문제의 정답을 출력한다.