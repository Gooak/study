package backjun

fun main() {
    var input = readln().toMutableList()
    var compareNumb1 = 1
    var compareNumb2 = 1

    var count = 0

    var result = "NO"
    if(input.size == 1){
        return println("NO")
    }
    for (i in 0 until input.size) {
        for (j in 0 until count) {
            compareNumb1 = compareNumb1 * input[j].toString().toInt()
        }

        for (k in count until input.size) {
            compareNumb2 = compareNumb2 * input[k].toString().toInt()
        }
        println("$compareNumb1 $compareNumb2")
        if (compareNumb1 == compareNumb2){
            result = "YES"
            break
        }
        compareNumb1 = 1
        compareNumb2 = 1
        count++
    }
    println(result)
}