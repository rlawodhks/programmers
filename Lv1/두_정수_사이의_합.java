package Lv1;

public class 두_정수_사이의_합 {

    public static long solution(int a, int b) {
        long answer = 0;
        int temp = 0;

        if (a > b) {                        // for문을 사용하기위해 a를 최소값으로 바꾸기
            temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }
}
