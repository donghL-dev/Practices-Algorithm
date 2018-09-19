package baekjoon;

import java.io.*;

public class _10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.valueOf(in.readLine());
        String str = in.readLine();
        int a = 0;
        int b = 0;
        if(v < 1 || v > 15)
            System.exit(0);

        for(int i=0; i<v; i++) {
            if(str.charAt(i) == 'A')
                a++;
            else if(str.charAt(i) == 'B')
                b++;
            else
                System.exit(0);
        }

        if(a > b)
            System.out.println("A");
        else if(a < b)
            System.out.println("B");
        else
            System.out.println("Tie");
    }
}
