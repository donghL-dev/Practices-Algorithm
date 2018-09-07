package baekjoon;

import java.io.*;

public class _3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str2 = str.split(" ");

        int r1 = Integer.valueOf(str2[0]);
        int s = Integer.valueOf(str2[1]);

        if(r1 < -1000 || r1 > 1000 || s < -1000 || s > 1000)
            System.exit(0);

        int num = s * 2;
        int result = num - r1;

        System.out.println(result);

    }
}
