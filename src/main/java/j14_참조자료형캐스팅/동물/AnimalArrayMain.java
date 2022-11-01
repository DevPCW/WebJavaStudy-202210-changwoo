package j14_참조자료형캐스팅.동물;

public class AnimalArrayMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
//        Animal animal1 = new Human(); // Human 객체를 바로 생성해서 animal1에 업캐스팅
        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        // 업캐스팅을 하는 이유:
        // 1. 배열에 넣을 수 있음.(배열로 묶을 수 있음.) -> 반복 사용 가능해짐
        // 2. 부품 조립.

        for(int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        // 다운 캐스팅을 통해 반복을 사용하는 방법.(instanceof를 활용)
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) { // instance: 생성된 object // 꺼낸 객체가 Human으로 생성된 건지.
//                Human h = (Human) animals[i];
//                h.readBooks(); // -> 이렇게 해도되고,
                ((Human) animals[i]).readBooks(); // 참조 자료형이 우선순위가 높아서 (Human) animals[i]에 괄호가 필요함.

            }else if(animals[i] instanceof Tiger) { // 꺼낸 객체가 Tiger면 .hunting(); 메소드를 실행해라.
                ((Tiger) animals[i]).hunting();
            }
        }
    }
}
