package baekjoon

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/2164
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val queue: Queue<Int> = LinkedList()

    queue.addAll(List(input.readLine().toInt()) { it + 1 })
    repeat(queue.size - 1) {
        queue.poll()
        queue.add(queue.poll())
    }

    output.write("${queue.peek()}")
    output.flush()
    output.close()
}
