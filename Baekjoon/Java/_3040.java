package baekjoon;

import java.io.*;

public class _3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int a = 0;
        int b = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            int n = Integer.valueOf(in.readLine());
            int[] arr3 = new int[9];
            if(n > 0 && n < 100) {
                arr[i] = n;
                arr3[i] = n;
            }
            if(i > 0) {
                for(int j=0; j<arr.length; j++) {
                    if(i != j) {
                        if(arr[i] == arr[j])
                            System.exit(0);
                    }
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    a = i;
                    b = j;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(i != a && i != b)
                System.out.println(arr[i]);
        }
    }
}
