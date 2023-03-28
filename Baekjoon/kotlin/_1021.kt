package baekjoon

import java.io.*
import java.util.*
import kotlin.collections.ArrayDeque

// https://www.acmicpc.net/problem/1021
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val tokenizer = StringTokenizer(input.readLine(), " ")
    val deque = ArrayDeque(List(tokenizer.nextToken().toInt()) { it + 1 })
    val results = input.readLine().split(" ").map { it.toInt() }.toMutableList()
    var count = 0

    for (findNum in results) {
        while (true) {
            val halfIndex = if (deque.size % 2 == 0) deque.size/2 - 1 else deque.size/2
            if (deque.indexOf(findNum) <= halfIndex) {
                val num = deque.removeFirst()
                if (num == findNum) {
                    break
                } else {
                    deque.addLast(num)
                    count++
                }
            } else {
                val num = deque.removeLast()
                deque.addFirst(num)
                count++
            }
        }
    }

    output.write("$count")
    output.flush()
    output.close()
}
