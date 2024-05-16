package backjun

fun main() {
    var input = readln().toMutableList()
    var compareNumb1 = 1
    var compareNumb2 = 1
    
    var result = "NO"
    if(input.size == 1){
        return println("NO")
    }
    for (i in 0 until input.size) {
        for (j in 0 until i) {
            compareNumb1 = compareNumb1 * input[j].toString().toInt()
        }

        for (k in i until input.size) {
            compareNumb2 = compareNumb2 * input[k].toString().toInt()
        }
        println("$compareNumb1 $compareNumb2")
        if (compareNumb1 == compareNumb2){
            result = "YES"
            break
        }
        compareNumb1 = 1
        compareNumb2 = 1
    }
    println(result)
}
// 숫자의 길이를 기준으로 i의 반복문에 i를 기준으로 i 이전, i이후의 포문을 돌려 곱한 수를 비교해 같으면 YES로 나타내어 값을 출력한다

//문제
//유진수는 어떤 수를 10진수로 표현한 뒤 그 수를 두 부분으로 나눴을 때, 앞부분 자리수의 곱과 뒷부분 자리수의 곱이 같을 때를 말한다.
//
//예를 들어, 1221은 유진수이다. 12와 21로 나눴을 때, 앞부분 자리수의 곱 1*2는 뒷부분 자리수의 곱 2*1과 같기 때문이다. 1236도 마찬가지로 유진수이다. 하지만, 1234는 아니다. 수를 나눌 때 항상 연속된 자리수를 나눠야하고, 각 부분에 적어도 한자리는 있어야 한다.
//
//예를 들어, 12345는 총 4가지 방법으로 나눌 수 있다. 1-2345, 12-345, 123-45, 1234-5 어떤 수 N이 주어질 때, 이 수가 유진수인지 아닌지 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 수 N이 주어진다. 이 수는 2,147,483,647보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄에 N이 유진수이면 YES, 아니면 NO를 출력한다.