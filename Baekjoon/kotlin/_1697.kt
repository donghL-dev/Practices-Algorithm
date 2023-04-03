package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/1697
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val dist = IntArray(100002) { -1 }
    val tokenizer = StringTokenizer(input.readLine(), " ")
    val n = tokenizer.nextToken().toInt()
    val k = tokenizer.nextToken().toInt()
    val queue: Queue<Int> = LinkedList()

    dist[n] = 0
    queue.offer(n)
    while (dist[k] == -1) {
        val cur = queue.peek()
        queue.poll()
        for (nxt in listOf(cur - 1, cur + 1, 2 * cur)) {
            if (nxt < 0 || nxt > 100000) continue
            if (dist[nxt] != -1) continue
            dist[nxt] = dist[cur] + 1
            queue.offer(nxt)
        }
    }

    output.write("${dist[k]}\n")
    output.flush()
    output.close()
}
