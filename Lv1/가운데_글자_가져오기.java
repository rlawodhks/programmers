package Lv1;

public class 가운데_글자_가져오기 {

    public static String solution(String s) {
        String answer = "";
        int cIndex = s.length() / 2;

        if (s.length() % 2 == 1) {
            answer = s.charAt(cIndex) + "";
        } else {
            answer = s.charAt(cIndex - 1) + "" + s.charAt(cIndex);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }
}
