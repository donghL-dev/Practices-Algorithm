import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val tokenizer = StringTokenizer(input.readLine(), " ")
    val l = tokenizer.nextToken().toLong()
    val u = tokenizer.nextToken().toLong()
    val result = sumOfDigits(u) - sumOfDigits(l - 1)

    output.write("${result}\n")
    output.flush()
    output.close()
}


fun sumOfDigits(n: Long): Long {
    if (n < 0) return 0

    var sum = 0L
    var len = n.toString().length
    var pow10 = 1L

    for (i in 1..len) {
        val nextPow10 = pow10 * 10
        val currentDigit = (n % nextPow10) / pow10
        val count = n / nextPow10

        sum += (count * 45 * pow10) // 완전한 세트의 합
        sum += (currentDigit * (currentDigit - 1) / 2) * pow10 // 현재 자릿수 이전까지의 합
        sum += currentDigit * (n % pow10 + 1) // 현재 자릿수의 합

        pow10 = nextPow10
    }

    return sum
}