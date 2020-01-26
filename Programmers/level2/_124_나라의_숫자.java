package programmers.level2;

public class _124_나라의_숫자 {
    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(9));
        System.out.println(solution(10));
    }
    private static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            int remainder = n % 3;
            int quotient = n / 3;

            if (remainder > 0) {
                answer.insert(0, remainder);
            } else {
                quotient--;
                answer.insert(0, "4");
            }

            n = quotient;
        }

        return answer.toString();
    }
}
