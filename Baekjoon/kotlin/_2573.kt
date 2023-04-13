package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/2573
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val board = Array(302) { IntArray(302) }
    var tokenizer = StringTokenizer(input.readLine(), " ")
    val n = tokenizer.nextToken().toInt()
    val m = tokenizer.nextToken().toInt()
    var year = -1

    for (i in 0 until n) {
        tokenizer = StringTokenizer(input.readLine(), " ")
        for (j in 0 until m) {
            board[i][j] = tokenizer.nextToken().toInt()
        }
    }

    while (true) {
        year++
        if (isInvalid(board, n)) {
            output.write("0\n")
            break
        }

        val count = getMountainCount(board, n, m)
        if (count >= 2) {
            output.write("$year\n")
            break
        }

        melt(board, n, m)
    }

    output.flush()
    output.close()
}

private fun isInvalid(board: Array<IntArray>, n: Int): Boolean {
    var count = 0
    for (i in 0 until n) {
        count += board[i].count {
            it != 0
        }
    }
    return count == 0
}

private fun getMountainCount(board: Array<IntArray>, n: Int, m: Int): Int {
    val visit = Array(302) { BooleanArray(302) }
    var result = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (board[i][j] == 0 || visit[i][j]) {
                continue
            }
            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.offer(Pair(i, j))
            visit[i][j] = true
            result++
            while (queue.isNotEmpty()) {
                bfs(queue, board, visit, n, m)
            }
        }
    }
    return result
}

private fun melt(board: Array<IntArray>, n: Int, m: Int) {
    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)
    val visit = Array(302) { BooleanArray(302) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (board[i][j] == 0) {
                continue
            }
            for (dir in 0 until 4) {
                val nx = i + dx[dir]
                val ny = j + dy[dir]
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
                if (visit[nx][ny] || board[nx][ny] != 0) continue
                if (board[i][j] > 0) {
                    board[i][j]--
                    visit[i][j] = true
                }
            }
        }
    }
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
    val (x, y) = queue.peek()
    queue.poll()
    // print("(${cur.first}, ${cur.second}) -> ")
    for (dir in 0 until 4) {
        val nx = x + dx[dir]
        val ny = y + dy[dir]
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
        if (visit[nx][ny] || board[nx][ny] == 0) continue
        visit[nx][ny] = true
        queue.offer(Pair(nx, ny))
    }
}
