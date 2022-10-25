package j07_반복;

import java.util.Scanner;

public class Loop5 {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) { // 한번 반복 후 선언과 초기화가 다시 이루어짐.

            int dan = i + 2;

            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + " x " + num + " = " + (dan * num));
            }
        }




    }

}
