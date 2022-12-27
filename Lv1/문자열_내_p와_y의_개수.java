package Lv1;

public class 문자열_내_p와_y의_개수 {

    public static boolean solution(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {       // toCharArray() - char[]로 반환
            if (ch == 'p' || ch == 'P') {
                count++;
            } else if (ch == 'y' || ch == 'Y') {
                count--;
            }
        }

        return count == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
}
