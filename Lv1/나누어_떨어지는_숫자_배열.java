package Lv1;

import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {

    public static int[] solution(int[] arr, int divisor) {
        int[] answer;
        int[] temp = new int[arr.length];
        int size = 0;

        for (int i : arr) {
            if (i % divisor == 0) {             // 나누어 떨어지는 값
                temp[size] = i;
                size++;
            }
        }

        if (size == 0) {                        // 나누어 떨어지는 값이 하나도 없을때
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[size];
            System.arraycopy(temp, 0, answer, 0, answer.length);    // temp -> answer 복사
            Arrays.sort(answer);                                    // 정렬
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 6}, 10)));
    }

}
