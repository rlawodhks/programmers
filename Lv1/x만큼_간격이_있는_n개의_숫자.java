package Lv1;

public class x만큼_간격이_있는_n개의_숫자 {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];    // n만큼 생성
        long sum = 0;                   // int 실패
        for (int i = 0; i < n; i++) {
            answer[i] = sum += x;       // x만큼 더하고 넣기
        }
//        for (long l : answer)
//            System.out.print(l);

        return answer;
    }

    public static void main(String[] args) {
        solution(2, 5);
        solution(4, 3);
        solution(-4, 2);
    }
}
