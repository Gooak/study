package programmers

fun main() {
    var list = arrayOf<String>("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa")
    println(Solution1().solution(list))
}
class Solution1 {
    fun solution(babbling: Array<String>): Int {
        var compareList = arrayOf<String>("aya", "ye", "woo", "ma")
        var answer: Int = 0
        for(i in 0 until babbling.size){
            for(j in 0 until compareList.size){
                if(babbling[i] == "ayaaya" || babbling[i] == "yeye" || babbling[i] == "woowoo" ||babbling[i] == "mama"){
                    continue
                }
                else if(babbling[i].contains(compareList[j])){
                    println("$i $j ${babbling[i]} $answer")
                    babbling[i] = babbling[i].replace(compareList[j], " ")
                    if(babbling[i] == ""){
                        answer++
                    }
                }
            }
            if(babbling[i].replace(" ","") == "") answer++
        }
        return answer
    }
}