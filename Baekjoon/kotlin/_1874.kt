package baekjoon.kotlin

import java.io.*
import java.util.Stack

// https://www.acmicpc.net/problem/1874
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val out = BufferedWriter(OutputStreamWriter(System.out))
    val n = input.readLine().toInt()
    val inputs = List(n) {input.readLine().toInt()}
    val stack = Stack<Int>()
    val answer = mutableListOf<String>()
    var next = 1

    repeat(n) {
        val num = inputs[it]
        while (num >= next) {
            stack.push(next++)
            answer.add("+")
        }

        if (stack.isNotEmpty() && stack.peek() == num) {
            stack.pop()
            answer.add("-")
        } else {
            Unit
        }
    }

    if (stack.isNotEmpty()) {
        out.write("NO")
    } else {
        answer.forEach { out.write(it + "\n") }
    }

    out.flush()
    out.close()
}
