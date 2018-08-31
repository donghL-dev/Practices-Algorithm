package baekjoon;


import java.io.*;

public class _1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        int result = n;
        int count = 0;
        boolean a = true;

        if(n < 0 || n > 99)
            System.exit(0);

        while(a) {
            int ac = n/10;
            int b = n%10;
            int c = ac+b;
            n = (b*10) + (c%10);
            if(result == n)
                a = false;
            count++;
        }

        System.out.println(count);
    }
}
