package baekjoon;

import java.io.*;
import java.util.*;

public class _2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String[] arr = new String[5];

        for(int i=0; i<5; i++) {
            String str = in.readLine();
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == 'F' && str.charAt(j+1) == 'B' && str.charAt(j+2) == 'I') {
                    arr[i] = String.valueOf(i+1);
                }
            }
            if(arr[i] == (null)) {
                arr[i] = "";
            }
        }

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != "")
                System.out.print(Integer.valueOf(arr[i]) + " ");
            else if(arr[i] == "" && arr[i+1] == "" && arr[i+2] == "" && arr[i+3] == "" && arr[i+4] == "" ) {
                System.out.println("HE GOT AWAY!");
                break;
            }
        }
    }
}
