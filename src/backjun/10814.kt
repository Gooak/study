package backjun

fun main(){
    val index = readln().toInt()
    val arr = ArrayList<Triple<Int,String,Int>>()
    for(i in 0 until index){
        var line = readln().split(" ")
        arr.add(Triple(line[0].toInt(), line[1], i))
    }
    arr.sortWith(compareBy<Triple<Int,String,Int>> {it.first}.thenBy { it.third }.thenBy { it.second })

    repeat(index){
        println("${arr[it].first} ${arr[it].second}")
    }
}

