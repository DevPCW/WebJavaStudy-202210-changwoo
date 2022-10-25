package j03_형변환;

// 문자 < 정수 < 실수
public class Conversion {

    public static void main(String[] args) {
        // upcasting(업캐스팅)
        char cast1 = 'a';
        System.out.println((int) cast1);

        int cast2 = cast1; // 묵시적 형변환: cast1앞의 (int)생략 가능
        System.out.println(cast2);

        System.out.println();



        // downcasting(다운캐스팅)
        int cast3 = 98;
        char cast4 = (char)cast3;  // 명시적 형변환
        System.out.println(cast4);

        System.out.println();

        double cast5 = 3.14;
        int cast6 = (int) cast5;
        System.out.println(cast6);

        double cast7 = cast6;
        System.out.println(cast7);

        System.out.println();

    }


}
