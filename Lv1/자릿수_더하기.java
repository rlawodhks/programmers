package Lv1;

public class 자릿수_더하기 {

    public static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;       // 뒷자리만 더하기
            n /= 10;                // 뒷자리 자르기
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }
}
