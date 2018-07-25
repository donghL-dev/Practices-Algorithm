package baekjoon._for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        int num = Integer.parseInt(str);

        for(int i=num; i>0; i--) {
            System.out.println(i);
        }
    }
}
