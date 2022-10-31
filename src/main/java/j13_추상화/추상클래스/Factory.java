package j13_추상화.추상클래스;

/**
 * 설계도 뼈대 느낌.
 * abstract >> 추상적인
 * 1. 추상 메소드가 하나라도 포함되면 해당 클래스는 추상클래스로 정의 되어야 한다.
 * 2. 추상 클래스는 생성할 수 없다.
 * 3. 그 외의 다른 특징은 일반 클래스와 동일하다.
 */

public abstract class Factory { // 클래스 앞에도 abstract 필요

    private String name;

    public Factory(String name) { // 생성자를 정의를 할 수도 있음: 생성자 호출은 안됨.
        this.name = name;
    }

    // 생성의 목적이 아니라 개념을 묶기 위한 용도.
    public abstract void produce(String model); // 구현부가 없음. 그 자리에 세미콜론을 달아줌.
    public abstract void management();

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void printInfo() { // 구현부가 있는 정의한 메소드도 가질 수 있음: 상속받는 모든 클래스들이 동일하게 씀.
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름: " + name);

    }
}
