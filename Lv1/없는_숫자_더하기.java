package Lv1;

public class 없는_숫자_더하기 {

    public static int solution(int[] numbers) {
        int answer = 45;

        for (int i : numbers) {
            answer -= i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }
}
