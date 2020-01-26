package baekjoon;
import java.io.*;

public class _2484 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int n = Integer.valueOf(str);

        if(n < 1 || n > 1000)
            System.exit(0);

        int[] player = new int[n];
        int count = 0;

        for(int i=0; i<player.length; i++) {
            String str2 = in.readLine();
            String[] str3 = str2.split(" ");
            int a = Integer.valueOf(str3[0]);
            int b = Integer.valueOf(str3[1]);
            int c = Integer.valueOf(str3[2]);
            int d = Integer.valueOf(str3[3]);

            if(a == b && b == c && c == d) {
                count = 50000 + (a*5000);
                player[i] = count;
            }

            if(a == b && a == c && a != d) {
                count = 10000 + (a*1000);
                player[i] = count;
            }
            if(b == c && b == d && b != a) {
                count = 10000 + (b*1000);
                player[i] = count;
            }
            if(c == a && c == d && c != b) {
                count = 10000 + (c*1000);
                player[i] = count;
            }
            if(d == a && d == b && d != c) {
                count = 10000 + (a*1000);
                player[i] = count;
            }

            if(a == b && c == d && c != b) {
                count = 2000 + (a * 500) + (c * 500);
                player[i] = count;
            }
            if(a == c && b == d && c != b) {
                count = 2000 + (a * 500) + (b * 500);
                player[i] = count;
            }
            if(a == d && b == c && d != b) {
                count = 2000 + (a * 500) + (b * 500);
                player[i] = count;
            }

            if(a == b && a != c && b != d && c != d) {
                count = 1000 + (a * 100);
                player[i] = count;
            }
            if(a == c && a != b && c != d && b != d) {
                count = 1000 + (a * 100);
                player[i] = count;
            }
            if(a == d && a != b && d != c && b != c) {
                count = 1000 + (a * 100);
                player[i] = count;
            }
            if(b == c && b != a && c != d && a != d) {
                count = 1000 + (b * 100);
                player[i] = count;
            }
            if(b == d && b != c && d != a && c != a) {
                count = 1000 + (b * 100);
                player[i] = count;
            }
            if(c == d && c != a && d != b && a != b) {
                count = 1000 + (c * 100);
                player[i] = count;
            }


            if(a != b && b != c && c != d && a != d && a != c && b != d) {
                if(a > b && a > c && a > d)
                    count = a * 100;
                else if ( b > a && b > c && b > d )
                    count = b * 100;
                else if ( c > b && c > a && c > d )
                    count = c * 100;
                else if ( d > a && d > b && d > c )
                    count = d * 100;
                player[i] = count;
            }
        }

        int max = 0;
        for(int i=0; i<player.length; i++) {
            if(player[i] >= max)
                max = player[i];
        }

        System.out.println(max);
    }
}

