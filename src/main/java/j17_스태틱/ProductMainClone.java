package j17_스태틱;


import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMainClone {
    private String name; // 이 변수를 쓰려면 'ProductMainClone' 을 생성해야 사용 가능.


    public static void main(String[] args) {
        // main 메소드 역시 static 영역임. ProductMainClone을 생성하지 않아도 호출 됨.
        int autoIncrement = Product.getAutoIncrement();

        System.out.println("[ static 특징1 ]");
        System.out.println(autoIncrement);
        // 메모리를 할당한 적이 없는데, 값이 나옴. -> 힙 메모리에 할당 된 것이 아님.
        // 'static' 은 'static' 만의 공간이 있는데 거기서 들고 온거임.

        System.out.println("--------");

        System.out.println("[ static 특징2 ]");
        System.out.println(Product.autoIncrement); // 초기 값: 20220000
        Product.autoIncrement++; // 여기서 증감 연산자를 통해, 20220001이 됐고
        System.out.println(Product.getAutoIncrement());

        Product p1 = new Product("p1"); // 생성되면서 또 증가 되어 '20220002' 가 됨.
        System.out.println(p1.getAutoIncrement());

        System.out.println("--------");

        System.out.println("[ static 특징3 ]");
        // 새로운 객체를 생성해도, 생성된 객체 하나하나가 static 영역에 저장되어 있는 'autoIncrement' 를 공유하고 있음.
        // 마찬가지로 'autoIncrement' 는 static 영역에서 그 값을 독립적으로 유지하고 있음.
        Product p2 = new Product("p1");
        Product p3 = new Product("p1");
        Product p4 = new Product("p1");
        Product p5 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        System.out.println(p2.getAutoIncrement());
        System.out.println(p3.getAutoIncrement());
        System.out.println(p4.getAutoIncrement());
        System.out.println(p5.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());

        System.out.println("------------------");

        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);


        System.out.println("------------------");
        // 'static' 메소드에 대해서 알아보기
        Product.printInfo(); // 클래스 명 주소 참조 해서 바로 스태틱 메소드 사용.

        ProductMainClone productClone = new ProductMainClone();

        ProductMainClone.main(new String[] {}); // => main 에서 main을 호출 할 수 있음: 재귀함수 : 실행 해보면 stackoverflow 발생

        productClone.setName("테스트");
        System.out.println(productClone.getName());


    }
}
