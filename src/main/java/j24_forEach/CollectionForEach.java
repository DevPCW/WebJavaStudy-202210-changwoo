package j24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        for(String name : list) {
            System.out.println(name);
        }

        System.out.println("-------------------------------------");

        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };


        Consumer<String> consumer = name -> {
            System.out.println(name);
        };
        for(String name : Objects.requireNonNull(list)) {
            consumer.accept(name);
        }

        System.out.println("-------------------------------------");


        // Collection 들은 forEach 메소드를 지니고 있음.
        list.forEach(name -> { // 위의 로직을 간소화 시킨 코드
            System.out.println(name);
        });

        System.out.println("-------------------------------------");

        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i < 100; i++) {
            numbers.add(i + 1); // 1 ~ 100까지 추가
        }
        
        AtomicInteger result = new AtomicInteger(); // AtomicInteger 람다에 씀. 일반 변수에 연산처리를 할 때 씀

        numbers.forEach(num -> {
           result.addAndGet(num); // 'result' 가 가지고 있는 값을 가지고 와서 거기다가 더해라 +=과 동일
        });

        System.out.println(result.get()); // get(); 을 타고 가면 리턴 타입이 'int' 인 것을 알 수 있음.

        System.out.println("-------------------------------------");

        Map<Integer, String> students = new TreeMap<Integer, String>(); // TreeMap 을 쓸 수 있는 상황이 있음.(정렬)

        for(int i = 0; i < 10; i++) {
            students.put(20220001 + i, "김준" + (i + 1));
        }
        students.forEach((key, value) -> {
            System.out.println("학번: " + key + ", 이름: " + value);
        });
    }
}
