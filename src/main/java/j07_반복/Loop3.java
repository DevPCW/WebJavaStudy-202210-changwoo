package j07_반복;

import java.util.Scanner;

public class Loop3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;

        System.out.print("몇 번 반복 할지 입력하세요: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) { // i < n;: n이 반복횟수를 나타냄.
            System.out.println("i: " + (i + 1));

        }

        System.out.println();


        for (int i = 0; i < n; i++) {
            System.out.println("i: " + (n - i));
        }



    }
}
