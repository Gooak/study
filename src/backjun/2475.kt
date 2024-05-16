package backjun

fun main(){
    var numberList = readln().split(" ").map { it.toInt() }.toMutableList()
    var result = 0
    for(i in 0 until numberList.size){
        result += numberList[i] * numberList[i]
    }

    print(result % 10)
}