package j12_상속;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
    }


    // 오버라이드 단축키: ctrl + o -> Shift로 항목 선택 후 확인
    @Override
    public void move() {
        super.move();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
