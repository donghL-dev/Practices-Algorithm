package baekjoon;

import java.io.*;
// 덧셈, 뺄셈, 곱셈, 나눗셈을 할 수 있는 계산기 프로그램.
public class _5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long sum = 0;
        int i = 0;

        while(true) {

            if(i == 0) {
                int x = Integer.valueOf(in.readLine());
                String str = in.readLine();

               if (str.equals("=")) {
                   System.out.println(x);
                   System.exit(0);
               }

                int y = Integer.valueOf(in.readLine());

                if(x > 100000000 || x < -100000000 || y > 100000000 || y < -100000000)
                    System.exit(0);

                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                    if (str.equals("+"))
                        sum = x+y;
                    else if (str.equals("-"))
                        sum = x-y;
                    else if (str.equals("*"))
                        sum = x*y;
                    else if (str.equals("/"))
                        sum = x/y;
                } else
                    System.exit(0);

            }
            else {
                String str = in.readLine();
                if(str.equals("=")) {
                    System.out.println(sum);
                    System.exit(0);
                }

                int x = Integer.valueOf(in.readLine());

                if(x > 100000000 || x < -100000000)
                    System.exit(0);

                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                    if (str.equals("+"))
                        sum += x ;
                    else if (str.equals("-"))
                        sum -= x;
                    else if (str.equals("*"))
                        sum *= x;
                    else if (str.equals("/"))
                        sum /= x;
                }
                else
                    System.exit(0);
            }
            i++;
        }
    }
}
