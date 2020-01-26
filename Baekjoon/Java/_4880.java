package baekjoon;

import java.io.*;

public class _4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = in.readLine();
            String[] str2 = str.split(" ");
            int[] arr = new int[3];

            for(int i=0; i<arr.length; i++) {
                int x = Integer.valueOf(str2[i]);
                if(x >= -10000 && x < 10000)
                    arr[i] = x;
                else
                    System.exit(0);
            }

            for(int j=0; j<arr.length; j++) {
                int x = arr[j];
                if(j != 2) {
                    if(j == 0)
                        if(x == arr[j+1] || x == arr[j+2])
                            System.exit(0);
                    if(j == 1)
                        if(x == arr[j+1] || x == arr[j-1])
                            System.exit(0);
                }
            }

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;

            int a=arr[0], b=arr[1], c=arr[2];

            if((b-a) == (c-b)) {
                System.out.println("AP " + (c+(b-a)));
            }
            else if((b/a) == (c/b)) {
                System.out.println("GP " + (c*(b/a)));
            }
            else
                break;

        }
    }
}
