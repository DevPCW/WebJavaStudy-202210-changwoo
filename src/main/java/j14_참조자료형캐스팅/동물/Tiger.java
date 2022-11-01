package j14_참조자료형캐스팅.동물;

public class Tiger extends Animal{

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() { // 호랑이만 가지고 있는 메소드
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
