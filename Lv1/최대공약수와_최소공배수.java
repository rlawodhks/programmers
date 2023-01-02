package Lv1;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {             // 최대공약수
                answer[0] = i;
            }
        }

        answer[1] = n * m / answer[0];                  // 최소공배수 = 두 수의 곱 / 최대공약수

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }
}
