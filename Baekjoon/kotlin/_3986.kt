package baekjoon.stack_brackets

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/3986
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Char>()
    var count = 0

    repeat(input.readLine().toInt()) {
        stack.clear()
        val str = input.readLine()
        for (s in str) {
            if (stack.isEmpty()) {
                stack.push(s)
            } else {
                if (stack.peek() == s) {
                    stack.pop()
                } else {
                    stack.push(s)
                }
            }
        }
        if (stack.isEmpty()) {
            count++
        }
    }

    output.write("$count")
    output.flush()
    output.close()
}
