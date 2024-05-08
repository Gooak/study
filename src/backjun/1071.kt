package backjun

import java.util.*

fun main(){
    var input = Scanner(System.`in`)
    var index = input.nextInt()
    input.nextLine()

    var arr = mutableListOf<Int>()
    repeat(index){
        arr.add(input.nextInt())
    }

}

//진행중..