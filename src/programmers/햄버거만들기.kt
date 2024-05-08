package programmers

fun main(){

    var arr = intArrayOf(2,1,1,2,3,1,2,3,1)

    println(Solution().solution(arr))
}

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var result = StringBuilder()

        for(i in 0 until ingredient.size ){
            result.append(ingredient[i])
            if(result.length >= 4 && result.substring(result.length-4) == "1231"){
                result.setLength(result.length-4)
                answer++
            }
        }
        return answer
    }
}