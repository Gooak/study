package backjun

fun main(){
    var (A, B) = readln().split(" ")
    var result : Long = 0

    for(i in 0 until A.length){
        for(j in 0 until B.length){
            result += A[i].toString().toLong() * B[j].toString().toLong()
        }
    }
    println(result)
}