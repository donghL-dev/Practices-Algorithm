package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/2206
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val board = Array(1002) { IntArray(1002) }
    val dist = Array(1002) { Array(1002) { IntArray(2) { 0 } } }
    val tokenizer = StringTokenizer(input.readLine(), " ")
    val m = tokenizer.nextToken().toInt()
    val n = tokenizer.nextToken().toInt()
    val queue: Queue<Triple<Int, Int, Int>> = LinkedList()

    for (i in 0 until m) {
        val elements = input.readLine()
        for (j in 0 until n) {
            board[j][i] = elements[j].toString().toInt()
        }
    }

    queue.offer(Triple(0, 0, 1))
    dist[0][0][1] = 1
    var result = -1
    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)

    while (queue.isNotEmpty()) {
        val (x, y, chance) = queue.peek()
        if (x == n - 1 && y == m - 1) {
            result = dist[x][y][chance]
            break
        }
        queue.poll()
        // print("(${x}, ${y}, $chance) -> ")
        for (dir in 0 until 4) {
            val nx = x + dx[dir]
            val ny = y + dy[dir]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
            if (board[nx][ny] == 1 && chance == 1) {
                dist[nx][ny][0] = dist[x][y][chance] + 1
                queue.offer(Triple(nx, ny, 0))
            } else if ((board[nx][ny] == 0 && dist[nx][ny][chance] == 0)) {
                dist[nx][ny][chance] = dist[x][y][chance] + 1
                queue.offer(Triple(nx, ny, chance))
            }
        }
    }

    output.write("$result\n")
    output.flush()
    output.close()
}
