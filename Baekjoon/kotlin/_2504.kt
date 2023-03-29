package baekjoon.stack_brackets

import java.io.*
import java.util.*

// https://www.acmicpc.net/problem/2504
fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Char>()

    val str = input.readLine()
    var result = 0
    var num = 1

    for (i in str.indices) {
        val s = str[i]
        if (s == '(' || s == '[') {
            stack.push(s)
            num *= if (s == '(') {
                2
            } else {
                3
            }
        } else if (s == ')' || s == ']') {
            if (stack.isEmpty()
                || (s == ')' && stack.peek() != '(')
                || (s == ']' && stack.peek() != '[')
            ) {
                result = 0
                break
            } else {
                val c = str[i - 1]
                if ((c == '(' && s == ')') || (c == '[' && s == ']')) {
                    result += num
                }
                num /= if (s == ')') {
                    2
                } else {
                    3
                }
                stack.pop()
            }
        }
    }

    output.write("${if (stack.isEmpty()) result else 0}\n")
    output.flush()
    output.close()
}
