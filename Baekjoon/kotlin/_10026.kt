package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/10026
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val board = Array(102) { CharArray(102) }
    var visit = Array(102) { BooleanArray(102) }
    val n = input.readLine().toInt()
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    var result = 0

    repeat(n) { i ->
        val str = input.readLine()
        for (j in  0 until n) {
            board[i][j] = str[j]
        }
    }

    for (i in 0 until n) {
        for (j in 0 until  n) {
            if (visit[i][j])
                continue
            result++
            visit[i][j] = true
            queue.offer(Pair(i, j))
            while (queue.isNotEmpty()) {
                bfs(queue, board, visit, n, n, board[i][j], false)
            }
        }
    }
    output.write("$result ")

    result = 0
    queue.clear()
    visit = Array(102) { BooleanArray(102) }
    for (i in 0 until n) {
        for (j in 0 until  n) {
            if (visit[i][j])
                continue
            result++
            visit[i][j] = true
            queue.offer(Pair(i, j))
            while (queue.isNotEmpty()) {
                bfs(queue, board, visit, n, n, board[i][j], true)
            }
        }
    }

    output.write("$result\n")
    output.flush()
    output.close()
}

private fun bfs(
    queue: Queue<Pair<Int, Int>>,
    board: Array<CharArray>,
    visit: Array<BooleanArray>,
    n: Int,
    m: Int,
    c: Char,
    flag: Boolean
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
        if (flag) {
            if (c == 'R' || c == 'G') {
                if (visit[nx][ny] || board[nx][ny] == 'B') continue
            } else {
                if (visit[nx][ny] || board[nx][ny] != c) continue
            }
        } else {
            if (visit[nx][ny] || board[nx][ny] != c) continue
        }
        visit[nx][ny] = true
        queue.offer(Pair(nx, ny))
    }
}
