package j09_클래스;

public class ClassAMain {
    // 생성을 하는 순간 힙메모리 공간을 빌리는 건데, 이걸 동적 메모리 할당이라고 함.
    public static void main(String[] args) {
        System.out.println(new ClassA()); // 새로운 클래스 A를 생성하라는 메소드. 주소(방)가 생성됨.
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());

        ClassA a1 = new ClassA(); // 새로만들어진 ClassA의 주소를 a1에 넣어놨는데, a1이라는 변수를 통해서 ClassA의 변수와 메소드에 접근할 수 있음.

        ClassA a2 = new ClassA();

        a1.name = "김준일"; // a1에 가서 name 안에 값을 넣어라.

        System.out.println(a1.name);

        a2.name = "김준이";

        System.out.println(a1.name);
        System.out.println(a2.name);

//        System.out.println(a1.callName());

        a1.callName();
        a1.callName();
        a2.callName();
    }
}
