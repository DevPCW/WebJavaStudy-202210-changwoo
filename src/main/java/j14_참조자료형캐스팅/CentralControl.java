package j14_참조자료형캐스팅;

/* 중앙제어 */
public class CentralControl {


    // interface로 구현 하는 이유: 부품 교체 용이. <- 객체지향 프로그램의 특징.
    private Power device1; // Power를 구현한 객체이기만 하면, device 자리에, 뭐든 들어올 수 있음.
    private Power device2; // Power라고 하는 인터페이스가 있을 때. 단자 규격이 맞는 장치 활용 가능.
    private Power device3;

    public CentralControl(Power device1, Power device2, Power device3) {
        this.device1 = device1;
        this.device2 = device2;
        this.device3 = device3;
    }

    public void powerOn() {
        device1.on();
        device2.on();
        device3.on();
    }

    public void powerOff() {
        device1.off();
        device2.off();
        device3.off();
    }
}
