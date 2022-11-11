package j22_람다;


public class OperationMain {

    public static void main(String[] args) {
        int a = 10, b = 20;

        Operation add = new Operation() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };



//        Operation add2 = (int x, int y) -> {
//            return x + y;
//        };

        // 생성도 됨.
        // 구현된 메소드 추상메소드가 딱 하나만 쓰여져야 함.
        // 'interface' 에서 'default' 메소드는 있어도 됨.
        // '람다' 는 무조건 abstract 메소드를 찾아감

        System.out.print("b + a: ");
        // public int calc: 메소드 이름 부분이 화살표가 됨
        Operation add2 = (int x, int y) -> {
            return x + y;
        };

        System.out.println(add2.calc(b, a));

        System.out.println("--------------------");

        // 매개변수의 자료형 생략 가능
        // 선언에 바로 리턴이 있는 경우 리턴 생략 가능. 리턴 생략하려면 중괄호도 같이 생략해야함.

        System.out.print("b - a: ");
        Operation sub = (x, y) -> x - y;

        System.out.println(sub.calc(b, a));


        System.out.println("--------------------");

        System.out.print("b - a: ");
        Operation multi = (x, y) -> x * y;

        System.out.println(multi.calc(b, a));


        System.out.println("--------------------");

        System.out.print("b / a: ");
        Operation div = (x, y) -> x / y;

        System.out.println(div.calc(b, a));


        System.out.println("--------------------");



        int addResult = add.calc(a, b);
        System.out.println(a + " + " + b + " = " + addResult);


        System.out.println("--------------------");

        int addResult2 = add2.calc(a, b);
        System.out.println(a + " + " + b + " = " + addResult2);


        System.out.println("--------------------");

        System.out.println(sub.resultToString(sub.calc(b, a)));


    }

}
