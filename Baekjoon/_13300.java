package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

// Problem URL : https://www.acmicpc.net/problem/13300
// Problem Name : 방 배정

public class _13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;

        int[] arr = new int[12];
        StringTokenizer tokenizer = new StringTokenizer(in.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        for (int i=0; i<n; i++) {
            tokenizer = new StringTokenizer(in.readLine(), " ");
            int gender = Integer.parseInt(tokenizer.nextToken()); // 0(여자), 1(남자)
            int grade = Integer.parseInt(tokenizer.nextToken()); //  학년

            switch (grade) {
                case 1:
                    if (gender == 0) {
                        arr[0]++;
                    } else {
                        arr[1]++;
                    }
                    break;
                case 2:
                    if (gender == 0) {
                        arr[2]++;
                    } else {
                        arr[3]++;
                    }
                    break;
                case 3:
                    if (gender == 0) {
                        arr[4]++;
                    } else {
                        arr[5]++;
                    }
                    break;
                case 4:
                    if (gender == 0) {
                        arr[6]++;
                    } else {
                        arr[7]++;
                    }
                    break;
                case 5:
                    if (gender == 0) {
                        arr[8]++;
                    } else {
                        arr[9]++;
                    }
                    break;
                case 6:
                    if (gender == 0) {
                        arr[10]++;
                    } else {
                        arr[11]++;
                    }
                    break;
                default:
                    break;
            }
        }

        for (int count : arr) {
            if (count == 0) {
                continue;
            }

            if (count < k) {
                answer++;
                continue;
            }

            answer += Math.ceil((double) count/k);
        }

        out.write(answer + "\n");
        out.flush();
        out.close();
    }
}
