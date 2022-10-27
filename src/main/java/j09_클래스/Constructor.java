package j09_클래스;

public class Constructor {

    int num;
    String name;

    Constructor() { // 자동차를 생성할 때 아무 옵션도 없이 생산하는 것
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Constructor(int num) { // 생성을 하는 타이밍에 값이 바로 들어감. : 생성자를 통한 값 주입.
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 하는 생성자)");
        this.num = num;
    }

    Constructor(String name) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 하는 생성자)");
        this.name = name;
    }

    Constructor(int num, String name) {
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this. name = name;
    }

    void showInfo() {
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }


}
