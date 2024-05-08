package backjun

fun main(){
    var inputString = readLine()!!.uppercase().toMutableList()
    if(inputString.size > 1000000){
        return
    }
    var compareInputString = inputString.distinct().toMutableList()

    var compareMap = mutableMapOf<Char, Int >()

    for(i in 0 until compareInputString.size){
        compareMap[compareInputString[i]] = 0
        for(j in 0 until inputString.size){
            if(inputString[j] == compareInputString[i]){
                compareMap[compareInputString[i]] = compareMap[compareInputString[i]]!! + 1
            }
        }
    }


    if(compareMap.size > 1){
        var list = compareMap.toList().sortedByDescending { it.second }
        if(list[0].second == list[1].second){
            print('?')
        } else{
            print(list[0].first)
        }
    } else{
        var key = compareMap.entries.first()
        print(key.key)
    }
}

// 대소문자 상관 없다고 했으므로 uppercase를 써서 대문자로 변환하였다.
// 알파벳 중복 제거를 해서 비교용 리스트를 만들었다.
// 문자와 비교용 리스트로 카운트를 맵 자료형으로 만들어

//문제
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//입력
//첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//출력
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

