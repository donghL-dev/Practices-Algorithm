import java.util.*;
import java.io.*;

/***
 Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers.
 Given an integer N, find the sum of all even fibonacci numbers.

 ex)
 Input: N = 12
 Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
 ***/
public class test {
    public static void main(String[] args) throws IOException  {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(in.readLine());
        int dp[] = new int[100];

        dp[0] = 0;
        dp[1] = 1;

        int sum = 0;

        int i = 2;

        while(n >= 2) {

            dp[i] = dp[i - 1] + dp[i - 2];

            if(dp[i] >= n)
                break;

            if(dp[i] % 2 == 0)
                sum += dp[i];

            i++;
        }

        out.write(sum + "\n");
        out.flush();
        out.close();
    }
}
