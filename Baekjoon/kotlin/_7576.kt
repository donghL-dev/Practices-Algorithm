package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/2178
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val board = Array(1002) { IntArray(1002) }
    val dist = Array(1002) { IntArray(1002) }
    var tokenizer = StringTokenizer(input.readLine(), " ")
    val m = tokenizer.nextToken().toInt()
    val n = tokenizer.nextToken().toInt()
    val queue: Queue<Pair<Int, Int>> = LinkedList()

    for (i in 0 until n) {
        tokenizer = StringTokenizer(input.readLine(), " ")
        for (j in 0 until m) {
            board[i][j] = tokenizer.nextToken().toInt()
            if (board[i][j] == 1) {
                queue.offer(Pair(i, j))
            } else if (board[i][j] == 0) {
                dist[i][j] = -1
            }
        }
    }

    while (queue.isNotEmpty()) {
        bfs(queue, dist, n, m)
    }

    var answer = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (dist[i][j] == -1) {
                output.write("-1\n")
                output.flush()
                output.close()
                return
            }
            answer = answer.coerceAtLeast(dist[i][j])
        }
    }

    output.write("$answer\n")
    output.flush()
    output.close()
}

private fun bfs(
    queue: Queue<Pair<Int, Int>>,
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
        if (dist[nx][ny] >= 0) continue
        dist[nx][ny] = dist[cur.first][cur.second] + 1
        queue.offer(Pair(nx, ny))
    }
}
