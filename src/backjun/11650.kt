package backjun

fun main() {
    val index = readln().toInt()
    val arrayList = ArrayList<Pair<Int,Int>>()
    repeat(index){
        val line = readln().split(" ").map{it.toInt()}
        arrayList.add(Pair(line[0], line[1]))
    }
    arrayList.sortWith(compareBy({it.first},{ it.second },))
    repeat(index){
        println("${arrayList[it].first} ${arrayList[it].second}")
    }
}

//2차원 두 수를 비교하는거라서 arr에 Pair를 선택하였다.
//이를 sortWith으로 두수를 비교하고 정렬하도록하였다.

//문제
//2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
//
//출력
//첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
