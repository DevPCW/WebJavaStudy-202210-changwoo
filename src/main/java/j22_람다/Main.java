package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // Runnable -> 쓰레드(프로그램이 동시에 돔)에서 가장 많이 씀.
        System.out.println("1. Runnable");
        Runnable runnable1 = () -> { // 리턴이 없어서 무조건 중괄호 필요
            System.out.println("첫 번째 프로그램을 실행합니다.");
        };
        Runnable runnable2 = () -> {
            System.out.println("첫 번째 프로그램을 실행합니다.");
        };
        runnable1.run();
        runnable2.run();



        // Thread
//        Thread thread1 = new Thread(() -> { // 매개변수 x, return x -> Runnable
//            for(int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(10); // 'sleep' 에 alt + enter -> 자동 완성
//                    System.out.println("쓰레드1: " + i);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            for(int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(10);
//                    System.out.println("쓰레드2: " + i);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();

        System.out.println("-----------------------------------------------------------");

        // Supplier
        System.out.println("1. Supplier");

        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());

        System.out.println("-----------------------------------------------------------");

        // Consumer
        System.out.println("2. Consumer");

        Consumer<String> consumer = (name) -> { // 매개 변수가 하나면 () 생략 가능
            System.out.println("이름: " + name);
        };
        consumer.accept("김준일");


        System.out.println("-----------------------------------------------------------");

        // Function
        System.out.println("3. Function");
        Function<Integer, String> function = age -> "나이: " + age;
        System.out.println(function.apply(29));

        System.out.println("-----------------------------------------------------------");

        // Predicate
        System.out.println("4. Predicate");
        Predicate<Integer> leapMonth = year -> year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(leapMonth.test(2000));
    }
}
