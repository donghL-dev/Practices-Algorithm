package baekjoon;

import java.io.*;
import java.util.*;

public class _2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        int[] sort = new int[8];
        int[] count = new int[5];
        int[] count2 = new int[5];
        int result = 0;
        int b = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.valueOf(in.readLine());
        }

        for(int i=0; i<8; i++) {
            sort[i] = arr[i];
        }

        Arrays.sort(sort);
        int x=3;

        for(int i=0; i<count.length; i++) {
            count[i] = sort[x];
            x++;
        }

        for(int i=0; i<count.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(count[i] == arr[j]) {
                    result += arr[j];
                    count2[i] = j+1;
                }
            }
        }

        System.out.println(result);
        Arrays.sort(count2);
        for(int i=0; i<5; i++)
            System.out.print(count2[i] + " ");

    }
}
