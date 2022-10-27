package j09_클래스;

public class ClassA {
    // ClassA는 밑의 정보를 담고 있는 자료형임.
    int num;
    String name;
    double score;

    // 생성자(모든 클래스가 가지고 있는데, 생략되어 있음)
    // 반환 자료형이 없다.
    // 클래스명과 일치해야함.
    // 생성자는 항상 주소가 반환이 됨. 그렇기 때문에 따로 반환 자료형을 두지 않음.
    // 메소드같이 안에 실행문을 넣을 수 있음.
    // 생성자의 호출이 항상 먼저임.
    // 다른 생성자로 오버로딩 되면 기존 생성자는 비활성화 됨.
    // 다 쓰고 싶으면 기존 거를(noargument constructor) 오버로딩 하면됨.
    // 앞으로 매개변수는 argument라고 부름

    ClassA() { // noargument constructor

    }

    ClassA(int a) {
        System.out.println("a: " + a);
        System.out.println("ClassA를 생성합니다.");
    }

    void callName() {
        System.out.println(name + "을(를) 부릅니다.");
    }

}
