package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/2146
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val board = Array(1002) { IntArray(1002) }
    var visit = Array(1002) { BooleanArray(1002) }
    val n = input.readLine().toInt()

    for (i in 0 until n) {
        val tokenizer = StringTokenizer(input.readLine(), " ")
        for (j in 0 until n) {
            board[i][j] = tokenizer.nextToken().toInt()
        }
    }

    var num = 1
    var answer = Int.MAX_VALUE
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (board[i][j] == 1) {
                val queue: Queue<Pair<Int, Int>> = LinkedList()
                num++
                queue.offer(Pair(i, j))
                board[i][j] = num
                while (queue.isNotEmpty()) {
                    bfs(queue, board, n, num)
                }
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (board[i][j] != 0) {
                val queue: Queue<Triple<Int, Int, Int>> = LinkedList()
                visit = Array(1002) { BooleanArray(1002) }
                queue.offer(Triple(i, j, 0))
                visit[i][j] = true
                while (queue.isNotEmpty()) {
                    val result= bfs(queue, board, visit, n, board[i][j])
                    if (result != -1) {
                        answer = answer.coerceAtMost(result)
                        break
                    }
                }
            }
        }
    }

    output.write("$answer\n")
    output.flush()
    output.close()
}

private fun bfs(
    queue: Queue<Pair<Int, Int>>,
    board: Array<IntArray>,
    n: Int,
    num: Int
) {
    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)
    val (x, y) = queue.peek()
    queue.poll()
    // print("(${cur.first}, ${cur.second}) -> ")
    for (dir in 0 until 4) {
        val nx = x + dx[dir]
        val ny = y + dy[dir]
        if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue
        if (board[nx][ny] != 1) continue
        board[nx][ny] = num
        queue.offer(Pair(nx, ny))
    }
}

private fun bfs(
    queue: Queue<Triple<Int, Int, Int>>,
    board: Array<IntArray>,
    visit: Array<BooleanArray>,
    n: Int,
    num: Int
): Int {
    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)
    val (x, y, z) = queue.peek()
    queue.poll()
    // print("(${x}, ${y}) -> ")
    for (dir in 0 until 4) {
        val nx = x + dx[dir]
        val ny = y + dy[dir]
        if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue
        if (visit[nx][ny] || board[nx][ny] == num) continue
        if (board[nx][ny] == 0) {
            queue.offer(Triple(nx, ny, z + 1))
            visit[nx][ny] = true
        } else {
            return z
        }
    }

    return -1
}
