package Lv1;

public class 시저_암호 {

    public static String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {    // 소문자일 경우
                ch += n;
                if (!String.valueOf(ch).matches("[a-z]")) {     // n만큼 이동한게 소문자가 아닐경우
                    ch -= 26;
                }
            } else if (Character.isUpperCase(ch)) {     // 대문자일 경우
                ch += n;
                if (!String.valueOf(ch).matches("[A-Z]")) {     // n만큼 이동한게 대문자가 아닐경우
                    ch -= 26;
                }
            }

            answer += ch;
        }

        return answer;
    }

    // A 65, Z 90, a 97, z 122     a~z 26
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }
}
