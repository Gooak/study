package backjun

fun main (){
    val n = readLine()!!.toInt()
    val arr = Array(n) { Array(2) { 0 } }

    repeat(n) {
        val line = readLine()!!.split(" ")
        arr[it][0] = line[0].toInt()
        arr[it][1] = line[1].toInt()

    }

    arr.sortWith(compareBy<Array<Int>> { it[1] }.thenBy { it[0] })

    var count = 0
    var time1 = arr[0][1]
    for(i in 1 until arr.size){
        if(time1 <= arr[i][0].toString().toInt()){
            count++
            time1 = arr[i][1].toString().toInt()
        }

    }
    println(count+1)
}

// 처음에 입력받아 시작 시간과 끝나는 시간이 안겹치면 count++하는걸로 만들었는데 틀렸다고 나왔다.
// arr.sortWith(compareBy<Array<Int>> { it[1] }.thenBy { it[0] })라는 다중 정렬을 사용하여 끝나는시간순으로 정렬을 하는데 thenBy를 써서
// 같은 끝나는시간일때 시작이 더 빠른순으로 정렬을 하였다.

//한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
//
//입력
//첫째 줄에 회의의 수 N(1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N+1 줄까지 각 회의의 정보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다. 시작 시간과 끝나는 시간은 231-1보다 작거나 같은 자연수 또는 0이다.
//
//출력
//첫째 줄에 최대 사용할 수 있는 회의의 최대 개수를 출력한다.