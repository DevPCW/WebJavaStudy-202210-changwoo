package j13_추상화.추상클래스;

public class PhoneFactory extends Factory{ // extends 상속 필요. // Override 필요. // 메소드는 꼭 구현을 해야 한다.(강제성)

    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ]모델 스마트폰을 생산합니다.");
    }
    
    //public void produce(String model): 선언부 // {}: 구현부 선언부 + 구현부 = 정의

    @Override
    public void management() {
        System.out.println("스마트 폰 공장을 관리합니다.");
    }
}
