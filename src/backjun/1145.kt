package backjun

fun main(){
    var numberList = readLine()!!.split(" ").map { it.toInt() }

    var result = 1
    while(true){
        var count = 0
        for(i in 0 until numberList.size){
            if(result % numberList[i] == 0){
                count++
            }
        }

        if(count >= 3){
            break
        } else{
            result++
        }
    }
    print(result)
}

// 브루트포스 알고리즘을 써서 result가 1씩 올라가면서 list를 순회한다. 거기서 3개이상 나누어 떨이지면 그게 대부분의 배수이다.

//문제
//다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.
//
//서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 다섯 개의 자연수가 주어진다. 100보다 작거나 같은 자연수이고, 서로 다른 수이다.
//
//출력
//첫째 줄에 적어도 대부분의 배수를 출력한다.