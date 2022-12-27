package Lv1;

public class 자연수_뒤집어_배열로_만들기 {

    public static int[] solution(long n) {
        String s = String.valueOf(n);       // String으로 형변환
        int[] answer = new int[s.length()]; // 길이만큼 배열 생성
        int i = 0;
        while (n > 0) {
            answer[i] = (int) (n % 10);     // 뒷자리 넣기
            n /= 10;                        // 뒷자리 자르기
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int i : solution(12345)) {
            System.out.print(i);
        }
    }
}
