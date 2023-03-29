package baekjoon.stack_brackets

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/4949
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Char>()

    while (true) {
        val str = input.readLine()
        if (str.equals(".")) {
            break
        }
        if (str.isEmpty() || !str.endsWith(".")) {
            output.write("no\n")
            continue
        }

        stack.clear()
        var flag = true
        for (s in str) {
            if (s == '(' || s == '[') {
                stack.push(s)
            } else if (s == ')' || s == ']') {
                if (stack.isEmpty()
                    || (s == ')' && stack.peek() != '(')
                    || (s == ']' && stack.peek() != '[')
                    ) {
                    flag = false
                    break
                } else {
                    stack.pop()
                }
            }
        }

        if (flag && stack.isEmpty()) {
            output.write("yes\n")
        } else {
            output.write("no\n")
        }
    }

    output.flush()
    output.close()
}
