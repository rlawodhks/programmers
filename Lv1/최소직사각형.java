package Lv1;

public class 최소직사각형 {

    public static int solution(int[][] sizes) {
        int w = 0, h = 0;

        for (int[] size : sizes) {
            int max = Math.max(size[0], size[1]);       // [가로, 세로] 길이 중에 큰값 찾기
            int min = Math.min(size[0], size[1]);       // 작은 값 찾기

            w = Math.max(w, max);           // 큰값 중 큰값 찾기
            h = Math.max(h, min);           // 작은값 중 큰값 찾기
        }

        return w * h;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));

    }
}
