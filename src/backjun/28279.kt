package backjun

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Deque
import java.util.LinkedList

fun main(arg: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var deque : Deque<Int> = LinkedList()
    repeat(readln().toInt()){
        var line = readln().split(" ").map{it.toInt()}

        when(line[0]){
            1 -> {
                deque.addFirst(line[1])
            }
            2 -> {
                deque.addLast(line[1])
            }
            3 -> {
                bw.write("${if(deque.isEmpty()) "-1" else "${deque.removeFirst()}"}\n")
            }
            4 -> {
                bw.write("${if(deque.isEmpty()) "-1" else "${deque.removeLast()}"}\n")
            }
            5 -> {
                bw.write("${deque.size}\n")
            }
            6 -> {
                bw.write("${if(deque.isEmpty()) "1" else "0"}\n")
            }
            7 -> {
                bw.write("${if(deque.isEmpty()) "-1" else "${deque.first}"}\n")
            }
            8 -> {
                bw.write("${if(deque.isEmpty()) "-1" else "${deque.last}"}\n")
            }
        }
    }
    bw.flush()
}

//덱 문제이다.