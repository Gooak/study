package backjun

fun main(){
    var numb = readln().toInt()

    for(i in 1..9){
        println("$numb * $i = ${numb * i}")
    }
}