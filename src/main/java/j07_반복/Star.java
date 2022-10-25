package j07_반복;

public class Star {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 10줄(반복 횟수)

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println();


        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < 10; i++) { // 10번 반복

            for (int j = 0; j < 10 - i - 1; j++) { // 공백

                System.out.print(" ");
            }

            for(int j = 0; j < i + 1; j++) { // 별
                System.out.print("*");
            }

            System.out.println();

        }

        for(int i = 0; i < 10; i++) {

            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}

