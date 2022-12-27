package Lv1;

public class 정수_내림차순으로_배치하기 {

    public static long solution(long n) {
        long answer = 0;
        int temp = 0;
        String[] sArr = String.valueOf(n).split("");        // String 형변환, split 분할해서 배열에 넣기
        int[] nArr = new int[String.valueOf(n).length()];

        for (int i = 0; i < sArr.length; i++) {
            nArr[i] = Integer.parseInt(sArr[i]);            // int 형변환 후 int 배열에 넣기
        }

        for (int j = 0; j < nArr.length; j++) {             // 개수만큼 돌리기
            for (int i = 0; i < nArr.length - 1; i++) {     // 조건에 [i + 1] 때문에 -1해줌
                if (nArr[i] < nArr[i + 1]) {                // 내림차순 < , 오름차순 >
                    temp = nArr[i];
                    nArr[i] = nArr[i + 1];
                    nArr[i + 1] = temp;
                }
            }
        }

        for (int i : nArr) {
            answer = i + (answer * 10);                     // 배열값 꺼내서 정수로 만들기
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
