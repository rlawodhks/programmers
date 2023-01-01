package Lv1;

public class 핸드폰_번호_가리기 {

    public static String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                answer += "*";
            } else
                answer += phone_number.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }
}
