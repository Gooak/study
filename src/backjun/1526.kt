package backjun

fun main() {
    var a = readln().toInt()
    var result = 0
    for (i in a downTo 1) {
        var numb = i.toString()
        numb = numb.replace('7',' ')
        numb = numb.replace('4',' ')
        if(numb.trim() == ""){
            result = i
            break
        }
    }

    println(result)
}

// 입력한 숫자로부터 감소하면서 7와 4를 지우고 numb에 공백을 지운후 공백이면 7 or 4로만 이루어진 숫자기 때문에 break하여 제시한다

//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//2 초	256 MB	8363	5049	4176	62.134%
//문제
//은민이는 4와 7을 좋아하고, 나머지 숫자는 싫어한다. 금민수는 어떤 수가 4와 7로만 이루어진 수를 말한다.
//
//N이 주어졌을 때, N보다 작거나 같은 금민수 중 가장 큰 것을 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 N이 주어진다. N은 4보다 크거나 같고 1,000,000보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄에 N보다 작거나 같은 금민수 중 가장 큰 것을 출력한다.
