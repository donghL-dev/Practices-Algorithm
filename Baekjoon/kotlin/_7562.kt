package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/7562
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val queue: Queue<Pair<Int, Int>> = LinkedList()

    repeat(input.readLine().toInt()) {
        val n = input.readLine().toInt()
        var tokenizer = StringTokenizer(input.readLine(), " ")
        val board = Array(n) { IntArray(n) }
        val dist = Array(n) { IntArray(n) { -1 } }
        val cur = Pair(tokenizer.nextToken().toInt(), tokenizer.nextToken().toInt())
        tokenizer = StringTokenizer(input.readLine(), " ")
        val dest = Pair(tokenizer.nextToken().toInt(), tokenizer.nextToken().toInt())
        queue.clear()
        queue.offer(cur)
        dist[cur.first][cur.second] = 0

        while (queue.isNotEmpty()) {
            bfs(queue, board, dist, n, n)
        }

        output.write("${dist[dest.first][dest.second]}\n")
    }

    output.flush()
    output.close()
}

private fun bfs(
    queue: Queue<Pair<Int, Int>>,
    board: Array<IntArray>,
    dist: Array<IntArray>,
    n: Int,
    m: Int
) {
    val dx = arrayOf(-1, -2, -2, -1, 1, 1, 2, 2)
    val dy = arrayOf(-2, -1, 1, 2, -2, 2, -1, 1)
    val (x, y) = queue.peek()
    queue.poll()
    // print("(${cur.first}, ${cur.second}) -> ")
    for (dir in 0 until 8) {
        val nx = x + dx[dir]
        val ny = y + dy[dir]
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
        if (dist[nx][ny] >= 0) continue
        dist[nx][ny] = dist[x][y] + 1
        queue.offer(Pair(nx, ny))
    }
}
