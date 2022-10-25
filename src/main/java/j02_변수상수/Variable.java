package j02_변수상수;


/* 변수 */
public class Variable {

    public static void main(String[] args) {

        // 논리 자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

        // 문자 자료형 변수
        char name1 = '김'; // 기본적으로 유니코드로 잡혀있음.
        char name2 = '준';
        char name3 = '일';

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println();

        System.out.println(name1 + name2 + name3);
        System.out.println("" + name1 + name2 + name3); // 문자열이랑 더해지면 결과가 문자열이 됨.

        System.out.println();

        System.out.println('가' + 0);

        int a= '가' + 0;
        System.out.println(Integer.toHexString(a));

        System.out.println();

        // 문자열 자료형 변수
        String name = "김준일";
        String name4 = "윤도영";
        String name5 = name + name4;
        System.out.println(name5);

        // 정수 자료형 변수
        int width = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        System.out.println();

        // long 타입 자료형 변수
        long time = System.currentTimeMillis();
        System.out.println(time);

        long time2 = 1666178887929L;
        System.out.println(time2);

        System.out.println();

        // 실수 자료형 변수
        double pi = 30000000.141592653599999999;
        System.out.println(pi);

        System.out.println();

        // 상수
        final String FILE_PATH = "C:/Users/junil"; // 값을 저장하는 상수는 변수명을 대문자로 약속: 스네이크 표기법.
        // FILE_PATH = "D:/Users/aaa";: 한번 선언했기 때문에 값을 변경할 수 없음. -> 상수.
        System.out.println(FILE_PATH);

        System.out.println();







    }

}
