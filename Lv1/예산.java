package Lv1;

import java.util.Arrays;

public class 예산 {

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);             // 부서를 많이 지원하기 위해 예산이 적은 순으로 정렬

        for (int i = 0; i < d.length; i++) {
            if (sum + d[i] <= budget) {         // 신청 금액이 예산보다 적어서 if문 안에 넣어줬다가
                sum += d[i];                    // 예산보다 초과하는 경우를 방지
                answer++;
            } else{
                return answer;      // 예산이 적고, 신청 부서가 많을경우
            }
        }

        return answer;              // 예산이 많아서 다 지원해준경우
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9));
//        System.out.println(solution(new int[]{2, 2, 3, 3}, 10));
    }

}
