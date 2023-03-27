package baekjoon

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/18258
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val queue: Queue<Int> = LinkedList()

    repeat(input.readLine().toInt()) {
        val tokenizer = StringTokenizer(input.readLine(), " ")
        when(tokenizer.nextToken()) {
            "push" -> queue.add(tokenizer.nextToken().toInt())
            "pop" -> {
                output.write("${queue.poll() ?: -1}\n")
            }
            "size" -> output.write("${queue.size}\n")
            "empty" -> {
                val num = if (queue.isNotEmpty()) 0 else 1
                output.write("$num\n")
            }
            "front" -> output.write("${queue.firstOrNull() ?: -1}\n")
            "back" -> output.write("${queue.lastOrNull() ?: -1}\n")
        }
    }

    output.flush()
    output.close()
}
