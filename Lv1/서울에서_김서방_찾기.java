package Lv1;

public class 서울에서_김서방_찾기 {

    public static String solution(String[] seoul) {
        int index = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")){
                index = i;
                break;
            }
        }

        return "김서방은 " + index + "에 있다";
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }
}
