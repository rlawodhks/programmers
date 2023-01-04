package Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 같은_숫자는_싫어 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int num = 9999;              // 원소 0~9
        ArrayList<Integer> tempArrList = new ArrayList<>(); // 배열 사이즈 때문에 ArrayList
        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i]) {                    // 중복이 아닐때
                tempArrList.add(arr[i]);            // 넣기
                num = arr[i];                       // 비교할 값도 새로 넣기
            }
        }
        answer = new int[tempArrList.size()];       // 남은 수 크기로 만들기

        for (int i = 0; i < answer.length; i++) {
            answer[i] = tempArrList.get(i);          // 값 넣기
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4, 4, 4, 3, 3})));
    }
}
