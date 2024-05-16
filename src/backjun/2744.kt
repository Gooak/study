package backjun

fun main(){
    var str = readln().toMutableList()

    for(i in 0..str.size-1){
        if(str[i].isUpperCase() == true) str[i] = str[i] + 32
        else str[i] = str[i] - 32
    }
    str.forEach {
        print(it)
    }
}