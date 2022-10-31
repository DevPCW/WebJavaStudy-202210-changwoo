package j12_상속;

public class Human extends Animal{ // 두개의 클래스가 합쳐짐.

    public Human(String name) { // Human의 생성자: Human이 생성이 되면 Animal도 같이 생성이 됨.
        // 부모가 있어야 자식이 있을 수 있음.
        super("준일"); // 이 코드가 숨겨져 있어서 부모(Animal)도 같이 생성되는 거임.(부모 생성자 호출) // super();는 부모의 주소 <-> this.: 자기 자신
//        super.move(); // 마우스를 올려보면 j12_상속.Animal 클래스에 들어가 있는 move다 라고 나옴.
        System.out.println("Human 생성"); // super(); 와 sout 코드의 순서가 뒤바뀌면 안됨. 중요함. 부모 생성자가 위에 있어야 함.
    }
        
    
        /*
            메소드 오버라이딩(오버라이드)
            [ 재정의 ]
            상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의하는 행위.
            메소드 위에 @Override 달아줘야함.
         */
        @Override // 어노테이션 오버라이드: 해당 메소드가 상위 객체로부터 재정의 된 메소드라는 사실을 표기. (약속)
        public void move() { // 상속 관계에서는 자식의 메소드가 선언이 된다.
            super.move(); // 부모의 move 호출하고 싶을 떄.
            System.out.println("두 발로 걷습니다.");
        }

}
