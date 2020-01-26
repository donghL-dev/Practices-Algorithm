package programmers.level1;

import java.util.Arrays;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"kiki", "eden"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"}));

    }
    private static String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        int answer = 0;

        for (int i=0; i<completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = i;
                break;
            } else if(i == completion.length - 1) {
                answer = participant.length - 1;
            }
        }

        return participant[answer];
    }
}
