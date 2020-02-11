package programmers.level2;

public class 조이스틱 {
    public static void main(String[] args) {
        System.out.println(solution("JAZ"));
        System.out.println(solution("JEROEN"));
        System.out.println(solution("ABABAAAAAAABA"));
        System.out.println(solution("ABABAAAAAAABA"));
        System.out.println(solution("AAB"));
        System.out.println(solution("AABAAABBB"));
    }
    private static int solution(String name) {
        int answer = 0;
        int exp = name.length() - 1;

        for (int i=0; i<name.length(); i++) {
            char currentChar = name.charAt(i);

            answer += currentChar <= 'N' ? currentChar - 'A'
                    : ('Z' - currentChar) + 1;


            int nextIndex = i + 1;

            while (nextIndex < name.length() && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }

            int tmp = i + name.length() - nextIndex + Math.min(i, name.length() - nextIndex);

            exp = exp > tmp ? tmp : exp;
        }

        answer += exp;
        return answer;
    }
}
