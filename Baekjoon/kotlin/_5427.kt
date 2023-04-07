package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/5427
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val jQueue: Queue<Pair<Int, Int>> = LinkedList()
    val fQueue: Queue<Pair<Int, Int>> = LinkedList()

    repeat(input.readLine().toInt()) {
        val board = Array(1002) { CharArray(1002) }
        val jDist = Array(1002) { IntArray(1002) {-1} }
        val fDist = Array(1002) { IntArray(1002) {-1} }
        val tokenizer = StringTokenizer(input.readLine(), " ")
        val m = tokenizer.nextToken().toInt()
        val n = tokenizer.nextToken().toInt()
        jQueue.clear()
        fQueue.clear()

        for (i in 0 until n) {
            val str = input.readLine()
            for (j in 0 until m) {
                board[i][j] = str[j]
                if (board[i][j] == '@') {
                    jQueue.offer(Pair(i, j))
                    jDist[i][j] = 0
                } else if (board[i][j] == '*') {
                    fQueue.offer(Pair(i, j))
                    fDist[i][j] = 0
                }
            }
        }

        while (fQueue.isNotEmpty()) {
            bfs(fQueue, board, fDist, n, m)
        }

        var flag = true
        while (jQueue.isNotEmpty()) {
            val dx = arrayOf(1, 0, -1, 0)
            val dy = arrayOf(0, 1, 0, -1)
            val (x, y) = jQueue.peek()
            jQueue.poll()
//             println("(${x}, ${y}) -> ")
            for (dir in 0 until 4) {
                val nx = x + dx[dir]
                val ny = y + dy[dir]
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    output.write("${jDist[x][y] + 1}\n")
                    jQueue.clear()
                    flag = false
                    break
                }
                if (jDist[nx][ny] >= 0 || board[nx][ny] == '#') continue
                if (fDist[nx][ny] != -1 && fDist[nx][ny] <= jDist[x][y]+1) continue
                jDist[nx][ny] = jDist[x][y] + 1
                jQueue.offer(Pair(nx, ny))
            }
        }

        if (flag) {
            output.write("IMPOSSIBLE\n")
        }
    }

    output.flush()
    output.close()
}

private fun bfs(
    queue: Queue<Pair<Int, Int>>,
    board: Array<CharArray>,
    dist: Array<IntArray>,
    n: Int,
    m: Int
) {
    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)
    val (x, y) = queue.peek()
    queue.poll()
    // print("(${cur.first}, ${cur.second}) -> ")
    for (dir in 0 until 4) {
        val nx = x + dx[dir]
        val ny = y + dy[dir]
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
        if (dist[nx][ny] >= 0 || board[nx][ny] == '#') continue
        dist[nx][ny] = dist[x][y] + 1
        queue.offer(Pair(nx, ny))
    }
}
