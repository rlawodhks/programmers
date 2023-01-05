package Lv1;

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];      // n값의 단어를 맨 앞에 더하기
        }

        Arrays.sort(answer);                                    // n값 기준으로 정렬

        for (int i = 0; i < strings.length; i++) {
            answer[i] = answer[i].substring(1);                 // 더한 앞 값 제거
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }
}
