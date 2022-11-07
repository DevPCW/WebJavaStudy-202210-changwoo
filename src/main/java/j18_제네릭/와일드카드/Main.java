package j18_제네릭.와일드카드;

public class Main {
    public AnimalData<? extends Animal> getAnimal(int flag) { // AnimalData 객체 리턴
        // <?> 어떠한 제네릭 타입이든 들어올 수 있지만, 'Animal' 클래스를 상속받은 타입만 들어올 수 있음.
        // 'super' 를 붙이면 자신과 상위에 있는 부모
        // => 와일드카드의 제약
        if (flag == 1) {
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;
        }else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
//        }else if (flag == 3) {
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("k8"));
//            return animalData; // 리턴에 제약이 걸림.
        }

        return null;
    }

    public static void main(String[] args) {
//        AnimalData<Human> animalData1 = new AnimalData<Human>(new Human());
//
//        animalData1.printData();

        Main main =  new Main();

        System.out.println(main.getAnimal(2));




    }

}
