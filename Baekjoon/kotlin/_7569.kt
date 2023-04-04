package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/7569
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val board = Array(102) { Array(102) { IntArray(102) } }
    val dist = Array(102) { Array(102) { IntArray(102) } }
    var tokenizer = StringTokenizer(input.readLine(), " ")
    val m = tokenizer.nextToken().toInt()
    val n = tokenizer.nextToken().toInt()
    val h = tokenizer.nextToken().toInt()
    val queue: Queue<Triple<Int, Int, Int>> = LinkedList()

    for (k in 0 until h) {
        for (i in 0 until n) {
            tokenizer = StringTokenizer(input.readLine(), " ")
            for (j in 0 until m) {
                val num = tokenizer.nextToken().toInt()
                board[i][j][k] = num
                if (board[i][j][k] == 1) {
                    queue.offer(Triple(i, j, k))
                } else if (board[i][j][k] == 0) {
                    dist[i][j][k] = -1
                }
            }
        }
    }

    while (queue.isNotEmpty()) {
        bfs(queue, dist, n, m, h)
    }

    var answer = 0
    for (k in 0 until h) {
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (dist[i][j][k] == -1) {
                    output.write("-1\n")
                    output.flush()
                    output.close()
                    return
                }
                answer = answer.coerceAtLeast(dist[i][j][k])
            }
        }
    }

    output.write("$answer\n")
    output.flush()
    output.close()
}

private fun bfs(
    queue: Queue<Triple<Int, Int, Int>>,
    dist: Array<Array<IntArray>>,
    n: Int,
    m: Int,
    h: Int
) {
    val dx = arrayOf(0, 0, -1, 1, 0, 0)
    val dy = arrayOf(-1, 1, 0, 0, 0, 0)
    val dz = arrayOf(0, 0, 0, 0, 1, -1)
    val (x, y, z) = queue.peek()
    queue.poll()
    // print("(${cur.first}, ${cur.second}) -> ")
    for (dir in 0 until 6) {
        val nx = x + dx[dir]
        val ny = y + dy[dir]
        val nz = z + dz[dir]
        if (nx < 0 || nx >= n || ny < 0 || ny >= m || nz < 0 || nz >= h) continue
        if (dist[nx][ny][nz] >= 0) continue
        dist[nx][ny][nz] = dist[x][y][z] + 1
        queue.offer(Triple(nx, ny, nz))
    }
}
