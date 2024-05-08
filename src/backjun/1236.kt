package backjun

import java.util.Scanner

fun main(){
    var input = readLine()!!.split(" ").map { it.toInt() }

    var index1 = input[0]
    var index2 = input[1]

    var count1 = 0
    var count2 = 0

    var list = Array(index1) { readLine()!!.toCharArray() }

    for(i in 0 until list.size){
        var check = false
        for(j in 0 until list[i].size){
            if(list[i][j] == 'X'){
                check = true
            }
        }
        if(check == false){
            count1++
        }
    }
    for(i in 0 until index2){
        var check = false
        for(j in 0 until list.size){
            if(list[j][i] == 'X'){
                check = true
            }
        }
        if(check == false){
            count2++
        }
    }
    print(if(count1 > count2) count1 else count2)
}

//처음 숫자를 입력받아 배열의 크기를 지정해주고
//열과 행을 for문으로 탐색하여 경비원이 없을 경우에 count를 더해주고 열count1과 행count2중 제일 큰값이 경비원이 필요한 숫자다

//
//문제
//영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다. 영식이는 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.
//
//성의 크기와 경비원이 어디있는지 주어졌을 때, 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는지 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 성의 세로 크기 N과 가로 크기 M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 성의 상태가 주어진다. 성의 상태는 .은 빈칸, X는 경비원이 있는 칸이다.
//
//출력
//첫째 줄에 추가해야 하는 경비원의 최솟값을 출력한다.