package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/1926
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val board = Array(502) { IntArray(502) }
    val visit = Array(502) { BooleanArray(502) }
    var tokenizer = StringTokenizer(input.readLine(), " ")
    val n = tokenizer.nextToken().toInt()
    val m = tokenizer.nextToken().toInt()
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    var widthMax = 0
    var imageCount = 0

    for (i in 0 until n) {
        tokenizer = StringTokenizer(input.readLine(), " ")
        for (j in 0 until m) {
            board[i][j] = tokenizer.nextToken().toInt()
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (board[i][j] == 0 || visit[i][j])
                continue
            imageCount++
            queue.clear()
            visit[i][j] = true
            queue.offer(Pair(i, j))
            var area = 0
            while (queue.isNotEmpty()) {
                area++
                bfs(queue, board, visit, n, m)
            }
            widthMax = widthMax.coerceAtLeast(area)
        }
    }

    output.write("$imageCount\n")
    output.write("$widthMax\n")
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
