package backjun

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Deque
import java.util.LinkedList

fun main(arg: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var deque : Deque<Int> = LinkedList<Int>()
    repeat(readln().toInt()){
        var line = readln().split(" ")
        when(line[0]){
            "push_front" ->{
                deque.addFirst(line[1].toInt())
            }
            "push_back" ->{
                deque.addLast(line[1].toInt())
            }
            "pop_front" ->{
                bw.write("${if(deque.isEmpty()) "-1" else "${deque.removeFirst()}"}\n")
            }
            "pop_back" ->{
                bw.write("${if(deque.isEmpty()) "-1" else "${deque.removeLast()}"}\n")
            }
            "size" ->{
                bw.write("${deque.size}\n")
            }
            "empty" ->{
                bw.write("${if(deque.isEmpty()) "1" else "0"}\n")
            }
            "front" ->{
                bw.write("${if(deque.isEmpty()) "-1" else "${deque.first}"}\n")
            }
            "back" ->{
                bw.write("${if(deque.isEmpty()) "-1" else "${deque.last}"}\n")}
        }
    }
    bw.flush()
}
//덱 문제이다.