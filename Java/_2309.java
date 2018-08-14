package baekjoon;

import java.io.*;
import java.util.*;

public class _2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList();
        int[] arr = new int[9];
        int a = 0;
        int b = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            int x = Integer.valueOf(in.readLine());
            arr[i] = x;
        }

        for(int i=0; i<arr.length; i++)
            sum += arr[i];


        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    a = i;
                    b = j;
                    break;
                    }
                }
            }

            for(int i=0; i<9; i++) {
                if(i == a || i == b) {
                    continue;
                }
                arrayList.add(arr[i]);
            }

            Collections.sort(arrayList);

            for(int v : arrayList) {
                System.out.println(v);
            }


    }
}
