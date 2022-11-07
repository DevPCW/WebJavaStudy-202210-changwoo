package j18_제네릭.와일드카드;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AnimalData<T> {

    private T animal;

    public void printData() {
        ((Animal) animal).move();

        if(animal.getClass() == Human.class) {
            ((Human) animal).readBooks(); // 다운캐스팅(강제형변환)
        }else if(animal.getClass() == Tiger.class) {
            ((Tiger) animal).hunting(); // 다운캐스팅(강제형변환)
        }

        System.out.println();
    }

}
