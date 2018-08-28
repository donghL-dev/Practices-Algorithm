package baekjoon;

import java.io.*;

public class _2473 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int count = 0;
        if(str.length() > 100) {
            System.exit(0);
        }

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
                count += 1;
            }
        }

        if(str.length() == count) {
            System.out.println(str.length());
        }
        else {
            System.exit(0);
        }
    }
}
