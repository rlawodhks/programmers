package Lv1;

public class 문자열_다루기_기본 {

    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6)     // 제한 사항 없으면 실패
            return s.matches("[0-9]+");             // 정규식
        else
            return false;
    }

    // 숫자만 true, 문자포함 false
    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }
}
