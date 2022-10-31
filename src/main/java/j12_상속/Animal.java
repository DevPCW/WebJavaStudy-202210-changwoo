package j12_상속;

public class Animal {
    private String name; // private을 줬기 때문에 getter setter를 상속한다.
    // 상속을 받았더라도 private 변수는 못 씀. Animal의 개인 소유.

//    public Animal() { // Animal의 생성자
//        System.out.println("Animal 생성");
//    }
    public Animal(String name) { // 부모 클래스에서 생성자 오버로딩이 이루어 졌을 때 자식 생성자 매개변수도 따라서 처리해야 함.
        System.out.println("Animal 생성");
        this.name = name;
    }

    public void move() {
        System.out.println("움직입니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
