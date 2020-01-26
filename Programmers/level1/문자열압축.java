package programmers.level1;

public class 문자열압축 {
    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));
        System.out.println(solution("ababcdcdababcdcd"));
        System.out.println(solution("abcabcdede"));
    }
    public static int solution(String s) {
        int ans = 987654321;

        // 모든 unit단위에 대해
        for(int unit = 1; unit <= s.length()/2+1 ; unit++) {

            int index = 0, count = 1, len = 0;
            String pre = s.substring(index, index+unit);
            index += unit;

            System.out.println(pre);

            // string에 unit 처리
            for(;index+unit -1 < s.length();) {

                if(pre.equals(s.substring(index, index+unit))) { // 동일 단위
                    count++;
                }else { // 동일 단위 아님

                    if(count != 1){
                        // count에 로그씌워서 길이 추가
                        len += (int)Math.log10(count)+1;
                    }

                    len += pre.length();
                    pre = s.substring(index, index+unit);
                    count = 1;
                }
                index += unit;
            }

            // 마지막 pre와 s의 남은 부분을 처리.
            if(count != 1)
                len += (int)Math.log10(count)+1;
            len += pre.length() + s.substring(index, s.length()).length();

            if(ans > len)
                ans = len;
        }
        return ans;
    }
}
