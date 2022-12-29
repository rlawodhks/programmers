package Lv1;

public class 콜라츠_추측 {

    public static int solution(int num) {
        int answer = 0;
        long longNum = num;             // 104번째 -1085063658 오버플로우, 정수범위 넘어서 long으로 대입

        while (longNum != 1) {
            longNum = longNum % 2 == 0 ? longNum / 2 : (longNum * 3) + 1;

            answer++;
            if(answer == 500)
                return -1;

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }
}
