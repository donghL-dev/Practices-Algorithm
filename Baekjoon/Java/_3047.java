package baekjoon;

import java.io.*;
import java.util.*;

public class _3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] str3 = str.split(" ");
        int[] arr = new int[3];

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.valueOf(str3[i]);
            if(arr[i]  > 100)
                System.exit(0);
        }

        Arrays.sort(arr);

        String str2 = in.readLine();

        for(int i=0; i<str2.length(); i++) {
            if(i != 2)
                System.out.print(arr[str2.charAt(i) - 'A'] + " ");
            else
                System.out.println(arr[str2.charAt(i) - 'A']);
        }

    }
}
