package baekjoon.kotlin

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/2493
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val out = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Pair<Int, Int>>()
    val n = input.readLine().toInt()
    val result = Array(n) {it}
    val tokenizer = StringTokenizer(input.readLine(), " ")

    repeat(n) {
        val tower = Pair(it + 1, tokenizer.nextToken().toInt())
        while (stack.isNotEmpty()) {
            if (stack.peek().second < tower.second) {
                stack.pop()
            } else {
                out.write("${stack.peek().first} ")
                break
            }
        }

        if (stack.isEmpty()) {
            out.write("0 ")
        }

        stack.push(tower)
    }

    out.flush()
    out.close()
}
