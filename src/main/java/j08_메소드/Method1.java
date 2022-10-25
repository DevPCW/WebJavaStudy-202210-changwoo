package j08_메소드;

/*
    메소드란? 함수이다.
    함수란? 일련의 동작을 묶어 정의한 것.
    특징: 입력과 출력을 가질 수 있다.
    그러면 왜 메소드라고 부르는가?

    클래스 안에 함수를 정의하면 메소드라고 부른다. // java는 일반 함수가 없다. 무조건 class 안에 정의해야하기 때문.
    함수를 실행하는 것을 우리는 호출(call)이라고 칭한다.

 */

public class Method1 {

    // 1. [x | x] 입력(매개변수), 출력(반환)
    public static void call1() { // void: 반환이 없다.
        System.out.println("[ x | x ]");
    }

    // 2. [o | x]
    public static void call2(String str) {
        System.out.println("[ o | x ]");
        System.out.println("수업과목: " + str);

    }

    // 3. [x | o]
    public static String call3() {
        System.out.println("[ x | o ]");

        String result = "";

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                result += "*";
            }
            result += "\n";
        }

        return result;
    }

    // 4. [ o | o ]
    public static String call4(int year, int month, int day) { // 함수는 입력은 여러개가 가능하지만 출력은 무조건 하나만 가능
        System.out.println("[ o | o ]");
        return year + "년 " + month + "월 " + day + "일";
    }


    // Main 메소드 // 프로그램의 시작점이니깐 JVM이 호출해준다.
    public static void main(String[] args) {
        call1();

        call2("java");

        String star1 = call3();
        System.out.println(star1);

        String date = call4(2022, 10, 24); //  메소드의 매개변수 자리에 정의 된 그대로 값을 전달할 때는 순서대로 넣어줘야 함.
        System.out.println(date);
    }

}
