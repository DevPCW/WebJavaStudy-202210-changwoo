package j08_메소드;

import java.util.Random;

public class RandomNumber { // 함수는 일련의 동작을 정의한 것. // 함수는 입력과 출력이 있다. // 함수는 class 안에 정의

    public static int calcRandom(int m) { // return 자료형은 int(반환 자료형)
        Random random = new Random();

        int result = random.nextInt(10) * 1000 + m;

        return result;
    }

    public static void main(String[] args) {
//        Random random = new Random();

        int money = 5000;

        /*int a = random.nextInt(10) * 1000 + money;
        System.out.println(a);
        int b = random.nextInt(10) * 1000 + money;
        System.out.println(b);
        int c = random.nextInt(10) * 1000 + money;
        System.out.println(c);
        int d = random.nextInt(10) * 1000 + money;
        System.out.println(d);*/


        /*for(int i = 0; i < 10; i++) {
            int randNum = random.nextInt(100) + 100;
            System.out.println(randNum);
        }*/

        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r = calcRandom(money); // 반복적인 코드의 입력 없이, int 자료형 변수에 넣어서 재사용 가능
        System.out.println(r + 100);
        System.out.println(r + 1000);
        System.out.println(r + 10000);
        System.out.println(r + 100000);

    }
}
