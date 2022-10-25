package j07_반복;

public class BreakAndContinue {

    public static void main(String[] args) {

        int i = 0;
        while(true) {
            if(i > 9) {
                break;
            }
            System.out.println(i);
            i++;
        }

        for(int j = 0; j < 10; j++) {
            if(j == 7) {
                System.out.println("7을 만났습니다.");
                break; // 7을 만났을 때 반복을 멈춤
            }
            System.out.println(j);
        }

        System.out.println("<<<<<<<< Continue >>>>>>>>");

        for(int j = 0; j < 100; j++) {

            if(j % 5 != 0 || j == 0) {
                continue; // 위의 조건이면 증감식으로 반복
            }
            System.out.println(j); // 5의 배수이거나 0이 아닐떄만 출력
        }

    }
}
