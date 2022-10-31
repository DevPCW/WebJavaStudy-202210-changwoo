package j12_상속;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal();
        Human human = new Human("김준일"); // Animal과 Human의 메모리의 공간이 붙어있음.(확장) // 하지만 명확하게 공간이 분리 되어있음. // 부모에 접근하려면 super라는 코드가 필요함.
        Tiger tiger = new Tiger("나비");

//        animal.move();
        human.move();
        tiger.move();

        System.out.println("사람의 이름: " + human.getName());
        System.out.println("호랑이의 이름: " + tiger.getName());


    }
}
