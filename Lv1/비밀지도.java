package Lv1;

import java.util.Arrays;

public class 비밀지도 {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
                            // 2. n만큼 공백으로 채우기      // 1. 2진수로 만들기         // 3. 공백을 0으로 바꾸기    1. "1001"
            String s1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(" ", "0");     // 2. " 1001"
            String s2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(" ", "0");     // 3. "01001"

            String result = "";
            for (int j = 0; j < n; j++) {
                if (s1.charAt(j) == '1' || s2.charAt(j) == '1') {     // 문자열 하나씩 체크
                    result += "#";
                } else {
                    result += " ";
                }
            }

            answer[i] = result;
        }

        return answer;
    }

    // 하나라도 1(벽)이면 벽, 둘다 0(공백)이면 공백
    // 한줄의 1과 0은 배열 한 원소 값의 2진수
    // 임의의 원소값의 2진수 길이는 n이하
    // 벽은 '#', 공백은 ' ' 로 구성된 문자열 배열로 출력해
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
    }
}
