package Lv1;

public class 약수의_합 {

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {                 // n을 1부터 n까지 나누기, 나머지가 0이면 약수
                System.out.print(i + "\t");
                answer += i;
            }
        }
        return answer;

        // n 다음 큰 약수는 n/2, 합에 n 더해주기
    }

    public static void main(String[] args) {
        System.out.println("\n" + solution(12));
        System.out.println("\n" + solution(5));
    }
}
