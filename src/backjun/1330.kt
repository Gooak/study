package backjun

fun main() {
    var (a, b) = readln().split(" ").map { it.toInt() }
    var result = if (a > b){ ">"} else if(a < b) { "<" } else if(a == b) {"=="} else ""
    print(result)
}