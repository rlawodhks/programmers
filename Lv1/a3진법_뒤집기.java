package Lv1;

public class a3진법_뒤집기 {

    public static int solution(int n) {
        String s = "";
                                    //      몫 나머지
        while (n > 0) {             // 45/3 15  0
            s = s + n % 3;          // 15/3 5   0
            n /= 3;                 // 5/3  1   2
        }                           // 1/3  0   1 ↑  3진법 1200
        // 0021
        return Integer.parseInt(s, 3);
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
        System.out.println(solution(125));
    }
}
