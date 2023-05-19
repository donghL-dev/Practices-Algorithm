package baekjoon.bfs

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/1600
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val k = input.readLine().toInt()
    val board = Array(1002) { IntArray(1002) }
    val dist = Array(1002) { Array(1002) { IntArray(k + 1) { -1 } } }
    var tokenizer = StringTokenizer(input.readLine(), " ")
    val m = tokenizer.nextToken().toInt()
    val n = tokenizer.nextToken().toInt()
    val queue: Queue<Triple<Int, Int, Int>> = LinkedList()

    for (i in 0 until n) {
        tokenizer = StringTokenizer(input.readLine(), " ")
        for (j in 0 until m) {
            board[i][j] = tokenizer.nextToken().toInt()
        }
    }

    queue.offer(Triple(0, 0, 0))
    dist[0][0][0] = 0
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
        if (chance < k) {
            horusBfs(queue, board, dist, n, m, x, y, chance)
            monkeyBfs(queue, board, dist, n, m, x, y, chance)
        } else {
            monkeyBfs(queue, board, dist, n, m, x, y, chance)
        }
    }

    output.write("$result\n")
    output.flush()
    output.close()
}

private fun horusBfs(
    queue: Queue<Triple<Int, Int, Int>>,
    board: Array<IntArray>,
    dist: Array<Array<IntArray>>,
    n: Int,
    m: Int,
    x: Int,
    y: Int,
    chance: Int
) {
    val dx = arrayOf(-1, -2, -2, -1, 1, 1, 2, 2)
    val dy = arrayOf(-2, -1, 1, 2, -2, 2, -1, 1)
    // print("(${cur.first}, ${cur.second}) -> ")
    for (dir in 0 until 8) {
        val nx = x + dx[dir]
        val ny = y + dy[dir]
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
        if (board[nx][ny] == 1 || dist[nx][ny][chance + 1] != -1) continue
        dist[nx][ny][chance + 1] = dist[x][y][chance] + 1
        queue.offer(Triple(nx, ny, chance + 1))
    }
}

private fun monkeyBfs(
    queue: Queue<Triple<Int, Int, Int>>,
    board: Array<IntArray>,
    dist: Array<Array<IntArray>>,
    n: Int,
    m: Int,
    x: Int,
    y: Int,
    chance: Int
) {
    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)
    // print("(${cur.first}, ${cur.second}) -> ")
    for (dir in 0 until 4) {
        val nx = x + dx[dir]
        val ny = y + dy[dir]
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
        if (board[nx][ny] != 0 || dist[nx][ny][chance] != -1) continue
        dist[nx][ny][chance] = dist[x][y][chance] + 1
        queue.offer(Triple(nx, ny, chance))
    }
}
