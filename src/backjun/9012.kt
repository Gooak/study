package backjun

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main(arg: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    repeat(readln().toInt()){
         stackFunc(readln())
    }
}

fun stackFunc(line : String){
    var stack = Stack<Char>()
    for(i in 0 until line.length){
        if(line[i] == '('){
            stack.push(line[i])
        } else if(line[i] == ')'){
            if(stack.isEmpty()){
                println("NO")
                return
            } else {
                stack.pop()
            }
        }
    }
    if(stack.isNotEmpty()){
        return println("NO")
    } else {
        return println("YES")
    }
}