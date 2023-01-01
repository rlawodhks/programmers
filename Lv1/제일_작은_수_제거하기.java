package Lv1;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int index = 0;

        if (arr.length == 1) {
            return new int[]{-1};
        }

        answer = new int[arr.length - 1];
        int min = Arrays.stream(arr).min().getAsInt();  // 작은 값 찾기

        for (int i : arr) {
            if (i != min) {             // 작은 값과 같으면 넣지 않기
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{10})));
    }
}
