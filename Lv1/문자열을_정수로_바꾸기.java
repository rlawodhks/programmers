package Lv1;
/*
    43  +
    45  -
    48  0
    49  1
    50  2
 */
public class 문자열을_정수로_바꾸기 {

    public static int solution(String s) {
        boolean negative = false;
        int total = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '-') {                // 부호 확인
                negative = true;
            } else if (ch == '+') {
                negative = false;
            } else {
                int num = ch - 48;          // 아스키코드
                total = num + (total * 10); // 1 -> 12 -> 123 -> 1234
            }
        }
        return negative ? -total : total;

//        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution("-1234"));
        System.out.println(solution("+9876"));
    }
}
