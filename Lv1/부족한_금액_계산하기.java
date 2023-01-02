package Lv1;

public class 부족한_금액_계산하기 {

    public static long solution(int price, int money, int count) {
        long answer = money;

        for (int i = 0; i < count; i++) {
            answer -= price + ((long) price * i);   // 금액이 부족하면 -값
        }

        return answer >= 0 ? 0 : -answer;           // 금액이 부족하지 않으면 0 리턴
    }

    // 이용료, 가지고 있는 금액, 번 째 이용
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
