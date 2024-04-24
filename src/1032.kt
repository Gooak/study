import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    val index = input.nextInt()
    input.nextLine()

    val str = mutableListOf<String>()

    for (i in 0 until index) {
        str.add(input.nextLine())
    }

    val result = StringBuilder(str[0])

    for(i in 1..str.size-1){
        for(j in 0..result.length-1){
            if(result[j] != str[i][j]){
                result[j] = '?'
            } else {
                continue
            }
        }
    }
    println(result)
}
// 파일이름이 다른것에 대한 ? 처리
//입력값으로 값이 다를 때 ? 처리 하고 이미 ? 일때는 넘어간다.