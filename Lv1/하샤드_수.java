package Lv1;

public class 하샤드_수 {

    public static boolean solution(int x) {
        int sum = 0, num = x;
        int length = String.valueOf(x).length();

        for (int i = 0; i < length; i++) {
            sum += x % 10;
            x /= 10;
        }

        return num % sum == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

}
