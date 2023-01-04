package Lv1;

public class 이상한_문자_만들기 {

    public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");         // [t, r, y,  , h, e, l, l, o,  , w, o, r, l, d]
        int index = 0;                      // 문자를 만났을때 사용하는 인덱스, 공백이후 문자를 만나면 0부터 시작

        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals(" ")) {
                str[i] = index % 2 == 0 ? str[i].toUpperCase() : str[i].toLowerCase();
                index++;
            }else {
                index = 0;
            }
            answer += str[i];
        }
        return answer;
    }

    // 짝수번째 대문자, 홀수번째 소문자
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
