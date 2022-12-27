package Lv1;

public class 평균_구하기 {

    public static double solution(int[] arr) {
        double answer = 0;

//        for (int i = 0; i < arr.length; i++){
//            answer += arr[i];
//        }
//        answer /= arr.length;

        for (int i : arr) {
            answer += i;
        }
        answer /= arr.length;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr));
        arr = new int[]{5, 5};
        System.out.println(solution(arr));
    }
}
