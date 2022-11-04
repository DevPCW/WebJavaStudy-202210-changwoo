package j17_스태틱.싱글톤;

import lombok.Getter;


public class Samsung { // 삼성이라는 회사는 하나만 존재해야 함.
    @Getter // 필드 위에 어노테이션 'import' 하면 'company' 만 'Getter' 를 가지게 됨.
    private String company;
    private int serialNumber; // 하나의 객체안에 들어가 있지만, 팩토리들은 공유해서 사용함.



    private static Samsung instance = null;

    private Samsung() { // 싱글톤으로 인해 아래 실행문을 가진채로 최초 한번만 생성됨.

        // Samsung 클래스는 기본적으로 Object 클래스를 상속받고 있기 때문에,
        // => public final native Class<?> getClass();

        // Object 클래스에는 getClass(); 메소드를 가지고 있음.
        company = getClass().getSimpleName();
        // 회사명 = 클래스 네임이 됨.

        serialNumber = 20220000;
    }

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }



}
