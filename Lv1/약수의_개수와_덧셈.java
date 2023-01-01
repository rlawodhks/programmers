package Lv1;

public class 약수의_개수와_덧셈 {

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {           // 두 정수 사이 계산
            int count = 0;

            for (int j = 1; j <= i; j++) {              // 1부터 left 까지 돌면서 약수 구하기
                if (i % j == 0) {                       // 약수면 카운트
                    count++;
                }
            }

            answer += count % 2 == 0 ? i : -i;          // 카운트가 짝수면 더하고 홀수면 빼기
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
    }
}
