package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/13549
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val dist = IntArray(100002) { -1 }
    val tokenizer = StringTokenizer(input.readLine(), " ")
    val n = tokenizer.nextToken().toInt()
    val k = tokenizer.nextToken().toInt()
    val queue: Deque<Int> = LinkedList()

    dist[n] = 0
    queue.offer(n)
    while (dist[k] == -1) {
        val cur = queue.peek()
        queue.poll()
        for (nxt in listOf(2 * cur, cur + 1, cur - 1)) {
            if (nxt < 0 || nxt > 100001) continue
            if (dist[nxt] != -1) continue
            if (nxt == 2 * cur) {
                dist[nxt] = dist[cur]
                queue.addFirst(nxt)
            } else {
                dist[nxt] = dist[cur] + 1
                queue.offer(nxt)
            }
        }
    }

    output.write("${dist[k]}\n")
    output.flush()
    output.close()
}
