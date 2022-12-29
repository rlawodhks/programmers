package Lv1;

public class 나머지가_1이_되는_수_찾기 {

    public static int solution(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;               // 찾으면 바로 리턴
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
    }
}
