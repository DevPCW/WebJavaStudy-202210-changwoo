package j14_참조자료형캐스팅;

/* 중앙제어 */
public class CentralControl {


    // interface로 구현 하는 이유: 부품 교체 용이. <- 객체지향 프로그램의 특징.
//    private Power device1; // Power를 구현한 객체이기만 하면, device 자리에, 뭐든 들어올 수 있음.
//    private Power device2; // Power라고 하는 인터페이스가 있을 때. 단자 규격이 맞는 장치 활용 가능.
//    private Power device3;

    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

//    public CentralControl(Power device1, Power device2, Power device3) {
//        this.device1 = device1;
//        this.device2 = device2;
//        this.device3 = device3;
//    }

    public void addDevice(Power device) {
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            System.out.println();
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");
        System.out.println();
    }

    private int checkEmpty() {
        for(int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void powerOn() {
        for(int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) continue;

            deviceArray[i].on();
        }
    }

//    public void powerOn() {
//        device1.on();
//        device2.on();
//        device3.on();
//    }

    public void powerOff() {
        for(int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) continue;

            deviceArray[i].off();
        }
    }

//    public void powerOff() {
//        device1.off();
//        device2.off();
//        device3.off();
//    }
}
