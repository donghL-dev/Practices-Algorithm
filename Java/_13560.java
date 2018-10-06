package baekjoon;

import java.io.*;
import java.util.*;

// 팀이 n명일때 가능한 경기의 수는 (n-1)*n/2번이니 오름차순으로 정렬해서 처음부터 카운트해가며
// 만약 (i-1)*i/2보다 작으면 1~i까지의 팀끼리 경기한 수보다 작은 것 이니 유효하지 않은 점수이다.

public class _13560 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        if(n < 1 || n > 10000)
            System.exit(0);

        String str = in.readLine();
        String[] str2 = str.split(" ");
        int[] arr = new int[n];
        int sum = 0;


        for(int i=0; i<n; i++) {
            arr[i] = Integer.valueOf(str2[i]);
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            sum += arr[i];
            if(sum < i*(i+1)/2) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        if(sum == n*(n-1)/2)
            System.out.println(1);
        else
            System.out.println(-1);
    }
}
