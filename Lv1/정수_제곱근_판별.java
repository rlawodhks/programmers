package Lv1;

public class 정수_제곱근_판별 {

    public static long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);        // 제곱근 함수 ²√

        if (x == (int) x) {             // 제곱근이 정수인지 확인
            answer = (long) ((x + 1) * (x + 1));
        } else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }

}
