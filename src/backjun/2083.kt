package backjun

fun main(){
    while(true){
        var (n, I, M) = readln().split(" ")
        if(n == "#" && I == "0" && M == "0"){
            break
        }
        if(I.toInt() > 17){
            println("$n Senior")
        } else if(M.toInt() >= 80){
            println("$n Senior")
        }
        else{
            println("$n Junior")
        }
    }
}