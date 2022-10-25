package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        /**
         * 문자열 입력.
         * next()           -> 띄어쓰기 포함 x
         * nextLine()       -> 띄어쓰기 포함 o
         */

        String name = "김준일";

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next(); // scanner.next()는 자료형이 문자열이라서 변수에 대입하기 위해서는 문자열 자료형 변수가 필요함.
        String s2 = scanner.next();
        String s3 = scanner.next();

//        String s4 = scanner.nextLine(); // spacebar를 포함해서 입력받고 싶을 떄.


        System.out.println("입력받은 값1: " + s); // Spacebar를 기준으로 짤림
        System.out.println("입력받은 값2: " + s2);
        System.out.println("입력받은 값3: " + s3);

//        scanner.next(); // 이 타이밍에 사용자의 입력을 기다림. Enter 입력 시 프로세스 종료
//        scanner.next();

    }
}
