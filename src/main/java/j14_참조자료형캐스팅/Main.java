package j14_참조자료형캐스팅;

// 객체의 다형성.
// 상위 객체만 있으면.(구현 시킬 수 있는 상위 객체 Power)
// 3구 멀티탭 느낌(순서 맘대로 가능) -> 모두 공통으로 220v 플러그가 있는 느낌.
// -> 멀티탭에 연결 할 수 있게 하는 것: 인터페이스의 역할
public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        // Power 객체는 없지만, Power로 여러개의 클래스들을 구현했기 때문에 얘네들이 하위이므로 업캐스팅되어져서
        // 캐스팅 자료형(Power) 생략하고, 매개변수로 들어가질 수 있음.
        CentralControl centralControl = new CentralControl(led, speaker, computer3); // 업캐스팅(묵시적 형변환)

        centralControl.powerOn();
        System.out.println("-----------------------");
        centralControl.powerOff();

    }

}
