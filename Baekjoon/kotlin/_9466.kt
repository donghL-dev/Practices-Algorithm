package baekjoon.bfs

import java.io.*
import java.util.*

const val notVisited = 0
const val cycleIn = -1

// https://www.acmicpc.net/problem/9466
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    repeat(input.readLine().toInt()) {
        val board = IntArray(100002)
        val visit = IntArray(100002)
        val n = input.readLine().toInt()
        val tokenizer = StringTokenizer(input.readLine(), " ")
        var result = 0

        for (i in 1 until n + 1) {
            board[i] = tokenizer.nextToken().toInt()
        }
        for (i in 1 until n + 1) {
            if (visit[i] == notVisited) {
                run(i, board, visit)
            }
        }
        for (i in 1 until n + 1) {
            if (visit[i] != cycleIn) {
                result++
            }
        }

        output.write("$result\n")
    }

    output.flush()
    output.close()
}

private fun run(x: Int, board: IntArray, visit: IntArray) {
    var cur = x
    while (true) {
        visit[cur] = x
        cur = board[cur]
        if (visit[cur] == x) {
            while (visit[cur] != cycleIn) {
                visit[cur] = cycleIn
                cur = board[cur]
            }
            return
        } else if (visit[cur] != 0)
            return
    }
}
