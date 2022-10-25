package j06_조건;

import java.util.Scanner;

public class Condition2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        int point = 0;
        String rating = null;

        System.out.print("회원 포인트 점수를 입력하세요: ");
        point = scanner.nextInt();

        if(point > VIP_POINT) {
            rating = "VIP";
        }else if(point > GOLD_POINT) {
            rating = "GOLD";
        }else if(point > SILVER_POINT) {
            rating = "SILVER";
        }else if(point > BRONZE_POINT) {
            rating = "BRONZE";
        }else {
            rating = "GENERAL";
        }

        System.out.println("회원의 등급: " + rating);

        if(point > SILVER_POINT) System.out.println("test"); // 중괄호가 생략되면 명령 하나를 실행할 수 있음.
//        System.out.println("test");
        else System.out.println("test2"); // else는 if와 한 묶음임.

        if(point > VIP_POINT) {
            rating = "VIP";
        }else { // <- 그래서 이 중괄호를 생략할 수 있음.
            if(point > GOLD_POINT) {
                rating = "GOLD";
            }else {
                if(point > SILVER_POINT) {
                    rating = "SILVER";
                }else {
                    if(point > BRONZE_POINT) {
                        rating = "BRONZE";
                    }else {
                        rating = "GENERAL";
                    }
                }
            }
        }



    }
}
