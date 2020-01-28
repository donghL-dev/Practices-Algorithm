package programmers.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class 가장_큰_수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }
    private static String solution(int[] numbers) {
        StringBuilder builder = new StringBuilder();
        List<String> list = new ArrayList<>();

        IntStream.rangeClosed(0, numbers.length - 1).forEach(i -> list.add(String.valueOf(numbers[i])));
        list.stream().sorted((a, b) -> (b + a).compareTo(a + b)).forEach(builder::append);

        return builder.toString().substring(0, 1).equals("0") ? "0" : builder.toString();
    }
}
