package backjun

fun main(){
    var input = readln().toInt()
    if(input % 400 == 0 || input % 100 != 0 && input % 4 == 0){
        print(1)
    } else{
        print(0)
    }
}