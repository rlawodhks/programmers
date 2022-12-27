package Lv1;

public class 짝수와_홀수 {

    public static String solution(int num) {
        String answer = "";

//        if (num % 2 == 0) {
//            answer = "Even_짝수";
//        } else {
//            answer = "Odd_홀수";
//        }
//        return answer;
        return num % 2 == 0 ? "Even_짝수" : "Odd_홀수";
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }
}
