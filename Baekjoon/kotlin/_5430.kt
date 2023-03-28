package baekjoon

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/5430
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val deque = ArrayDeque<Int>()

    repeat(input.readLine().toInt()) {
        deque.clear()
        val func = input.readLine()
        val n = input.readLine().toInt()
        val arrStr = input.readLine()
        val tokenizer = StringTokenizer(arrStr.substring(1, arrStr.length - 1), ",")
        deque.addAll(if (n > 0) List(n) {tokenizer.nextToken().toInt()} else emptyList())
        compileAC(
            func,
            n,
            deque,
            output
        )
    }

    output.flush()
    output.close()
}

private fun compileAC(func: String, n: Int, nums: Deque<Int>, out: BufferedWriter) {
    if (func.count { it == 'D' } > n) {
        out.write("error\n")
        return
    }

    var rCount = 0
    for (function in func) {
        if (function == 'D') {
            if (rCount % 2 == 0) {
                nums.removeFirst()
            } else {
                nums.removeLast()
            }

        } else if (function == 'R') {
            rCount++
        }
    }

    out.write(
        (if (rCount % 2 == 0) nums else nums.reversed())
            .joinToString(",", "[", "]\n")
    )
}
