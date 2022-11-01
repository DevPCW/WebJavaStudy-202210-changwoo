package j14_참조자료형캐스팅.동물;

public class AnimalMain {

    public static void main(String[] args) {

        Human human = new Human();
        Tiger tiger = new Tiger();
        Animal animal1 = null;
        Animal animal2 = null;

        System.out.println("[ 캐스팅 전(Before) ]");
        human.move();
        human.readBooks();
        tiger.move();
        tiger.hunting();

        System.out.println("[ 캐스팅 후(After) ]");


        // 상속을 받았기 때문에 Animal이 상위 객체 -> 상위 자료형으로 업캐스팅 됨.
        System.out.println("< 업 캐스팅(Upcasting) >"); // 본래 자식이 가지고 있는 메소드는 참조 불가하게 됨.
        animal1 = human;
        animal2 = tiger;

        animal1.move();
        animal2.move();
        // 메모리 공간에서 Human 공간은 잠시 비활성화 되는거임. Human 주소 참조 불가. 사라진건 아님 -> 업캐스팅 한 후 다시 다운 캐스팅 가능.

        System.out.println("< 다운 캐스팅(Downcasting) >"); // 업캐스팅이 된적이 있어야함.(메모리가 할당된 적이 있어야 함.)
        // Animal -> Human : 추상클래스라서 다운 캐스팅 안됨.
        Human d_human = (Human)animal1; // 명시적 형 변환 -> 캐스팅 자료형() 필요.
        Tiger d_tiger = (Tiger)animal2;
        d_human.readBooks(); // 본래 사람의 고유 메소드가 살아났음.
        d_tiger.hunting(); // 본래 호랑이의 고유 메소드가 살아났음.

        System.out.println("----------------------------------");
        System.out.println();

        // Animal이 추상 클래스에서 일반 클래스로 바꾼 후.
        Animal a = new Animal();
        Human h = (Human) a; // 잘못된 다운 캐스팅
        h.readBooks(); // ClassCastException: 형변환 컴파일 오류 발생.
        // -> Animal 이 생성된 경우 인데, Human이 할당 된 적이 없기 때문에.
        // 메소드가 텅 비어 있음. 그래서 h.readBooks() 사용 불가.


    }

}
