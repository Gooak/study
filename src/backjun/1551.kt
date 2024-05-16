package backjun

fun main(){
    var input = readln().split(" ").map { it.toInt() }
    var numberLength = input[0]
    var routine = input[1]

    var list = readln().split(",").map { it.toInt() }

    var numberList = mutableListOf<Int>()
    var numberMinusList = mutableListOf<Int>()

    for(i in 0 until numberLength){
        numberList.add(list[i])
        numberMinusList.add(list[i])
    }

    var count = 1
    for(i in 0 until routine){
        for(j in count until numberLength){
            numberMinusList[j] = numberList[j] - numberList[j-1]
        }
        numberList.clear()
        numberList.addAll(numberMinusList)
        count++
    }
    for(i in routine until numberMinusList.size){
        if(i == numberMinusList.size-1){
            print(numberMinusList[i])
        } else{
            print("${numberMinusList[i]},")
        }
    }
}

// routin이 한바뀌 돌고 정해질 numberList와 routin안에 수열 계산은 numberMinusList로 만들었다.
// count로 1부터 시작하여 B[i] = A[i+1]-A[i] 규칙을 B[i] = A[i-1]-A[i]로 바꾸어 length오류를 피했다.
// routin의 숫자까지 count가 올라가여 원하는 값에 연산을 가능하게 했다.

//문제
//크기가 N인 수열 A가 주어졌을 때, 세준이는 인접한 두 원소의 차이를 이용해서 크기가 N-1인 수열 B를 만들 수 있다.
//
//예를 들어, A = {5, 6, 3, 9, -1} 이었을 때, B = {6-5, 3-6, 9-3, -1-9} = {1, -3, 6, -10}이 된다. 즉, B[i] = A[i+1]-A[i]가 된다.
//
//수열 A가 주어졌을 때, 세준이가 위의 방법을 K번 했을 때 나오는 수열을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 수열의 크기 N과 K가 주어진다. N은 20보다 작거나 같은 자연수이고, K는 0보다 크거나 같고, N-1보다 작거나 같은 정수이다. 둘째 줄에는 수열이 ‘,’로 구분되어 주어진다. 수열을 이루고 있는 수는 절댓값이 100보다 작거나 같은 정수이다.
//
//출력
//첫째 줄에 K번 변형한 수열을 ‘,’로 구분하여 출력한다.

