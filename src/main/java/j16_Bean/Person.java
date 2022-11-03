package j16_Bean;

// 생성자에 대한 이야기.
public class Person {
    // 맴버 변수에 final을 선언하면 필수 값이 된다.
    private final String name;  // 밑의 방식으로 생성자를 만들면 변수가 초기화가 되지 안흔 상황이 생겨서 상수로 만들어줌.

                                // 상수로 만들 때는 초기화가 필수임.
    private int age;

//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;

    public Person(String name) {                        // requiredArgsConstructor
        this.name = name;
    }

    public Person(String name, int age) {               // AllArgsConstructor
        this.name = name;
        this.age = age;
    }

//    public Person() {                                 // NoArgsConstructor
//
//    } // 이러면 NoArgsConstructor는 생성 불가: 값 초기화가 이루어 지지 않기 때문.
}
