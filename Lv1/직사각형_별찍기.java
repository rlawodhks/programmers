package Lv1;

import java.util.Scanner;

public class 직사각형_별찍기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();         // 가로 길이
        int row = sc.nextInt();         // 세로 길이

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
