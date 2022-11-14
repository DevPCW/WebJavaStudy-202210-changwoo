package j23_예외;

public class Exception1 {
    public static void main(String[] args) {

        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7};

        try {
            String a = null;
            a.toLowerCase();

            for(int i = 0; i < 8; i++) {
                System.out.println(numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외를 처리하였습니다.");
        }catch (NullPointerException e) {
            System.out.println("null pointer to exception");
        }finally {
            for(int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            System.out.println("항상 실행되어야 하는 서비스");
        }

        System.out.println("프로그램 정상 종료");

    }

}
