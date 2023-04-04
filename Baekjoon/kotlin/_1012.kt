package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/1012
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    repeat(input.readLine().toInt()) {
        val board = Array(52) { IntArray(52) }
        val visit = Array(52) { BooleanArray(52) }
        var tokenizer = StringTokenizer(input.readLine(), " ")
        val m = tokenizer.nextToken().toInt()
        val n = tokenizer.nextToken().toInt()
        val k = tokenizer.nextToken().toInt()
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        var result = 0

        repeat(k) {
            tokenizer = StringTokenizer(input.readLine(), " ")
            val x = tokenizer.nextToken().toInt()
            val y = tokenizer.nextToken().toInt()
            board[x][y] = 1
        }

        for (i in 0 until m) {
            for (j in 0 until  n) {
                if (board[i][j] == 0 || visit[i][j])
                    continue
                result++
                visit[i][j] = true
                queue.offer(Pair(i, j))
                while (queue.isNotEmpty()) {
                    bfs(queue, board, visit, m, n)
                }
            }
        }

        output.write("$result\n")
    }

    output.flush()
    output.close()
}

private fun bfs(
    queue: Queue<Pair<Int, Int>>,
    board: Array<IntArray>,
    visit: Array<BooleanArray>,
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
        if (visit[nx][ny] || board[nx][ny] != 1) continue
        visit[nx][ny] = true
        queue.offer(Pair(nx, ny))
    }
}
