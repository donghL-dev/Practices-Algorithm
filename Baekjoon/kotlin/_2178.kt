package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/2178
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val board = Array(102) { IntArray(102) }
    val dist = Array(102) { IntArray(102) { -1 } }
    val tokenizer = StringTokenizer(input.readLine(), " ")
    val n = tokenizer.nextToken().toInt()
    val m = tokenizer.nextToken().toInt()
    val queue: Queue<Pair<Int, Int>> = LinkedList()

    for (i in 0 until n) {
        val elements = input.readLine()
        for (j in 0 until m) {
            board[i][j] = elements[j].toString().toInt()
        }
    }

    queue.offer(Pair(0, 0))
    dist[0][0] = 0
    while (queue.isNotEmpty()) {
        bfs(queue, board, dist, n, m)
    }

    output.write("${dist[n-1][m-1]+1}\n")
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
    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)
    val cur = queue.peek()
    queue.poll()
    // print("(${cur.first}, ${cur.second}) -> ")
    for (dir in 0 until 4) {
        val nx = cur.first + dx[dir]
        val ny = cur.second + dy[dir]
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
        if (dist[nx][ny] >= 0 || board[nx][ny] != 1) continue
        dist[nx][ny] = dist[cur.first][cur.second] + 1
        queue.offer(Pair(nx, ny))
    }
}
