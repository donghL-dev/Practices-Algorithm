package baekjoon;

import java.io.*;
import java.util.*;
public class _2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<3; i++) {
            int[] arr = new int[4];
           for(int j=0; j<1; j++) {
               String str = in.readLine();
               String[] str2 = str.split(" ");
               arr[0] = Integer.valueOf(str2[0]);
               arr[1] = Integer.valueOf(str2[1]);
               arr[2] = Integer.valueOf(str2[2]);
               arr[3] = Integer.valueOf(str2[3]);
           }
           Arrays.sort(arr);
           int x = arr[0];
           int y = arr[1];
           int z = arr[2];
           int c = arr[3];
           if(x == 0 && y == 1 && z == 1 && c == 1)
               System.out.println("A");
           if(x == 0 && y == 0 && z == 1 && c == 1)
               System.out.println("B");
           if(x == 0 && y == 0 && z == 0 && c == 1)
               System.out.println("C");
           if(x == 0 && y == 0 && z == 0 && c == 0)
               System.out.println("D");
           if(x == 1 && y == 1 && z == 1 && c == 1)
               System.out.println("E");
        }
    }
}
