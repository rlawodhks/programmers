package Lv1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {

    public static String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");

        Arrays.sort(sArr, Collections.reverseOrder());

        answer = String.join("", sArr);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
