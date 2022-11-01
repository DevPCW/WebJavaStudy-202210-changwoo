package j14_참조자료형캐스팅;

public class Computer implements Power{ //implements는 Override 해야 함. // Power의 기능들이 밑의 두 메소드임.
    @Override
    public void on() { // 컨트롤 + i: 단축키
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }
}
