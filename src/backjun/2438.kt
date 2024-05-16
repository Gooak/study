package backjun

fun main(){
    var a = readln().toInt()

    for(i in 0..a-1){
        for(j in i downTo(0)){
            print("*")
        }
        println()
    }
}