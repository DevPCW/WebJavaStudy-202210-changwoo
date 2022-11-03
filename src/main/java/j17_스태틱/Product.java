package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//

//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Product {
//    private static int autoIncrement = 20220000;
    public static int autoIncrement = 20220000; // 스태틱 변수: 변수 자료형 앞에 static 추가 후 바로 값 대입.
    // 잠시 'static' 의 특징들을 'ProductMainClone' 에서 확인하기 위해 접근지정자를 'private' -> 'public' 으로 변경
    private int serialNumber = 20220001;
//    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    // 'static' 메소드에 대해서 알아보기
    public static void printInfo() { // 생성이 안되어도 메소드 사용 가능.
//        System.out.println(productName); => 'static' 메소드 안에서는 'static' 변수만 사용 가능
        // 'productName' 은 생성이 되어야지 메모리 공간이 할당이 됨. => 그래서 쓸 수 없음.
        // => 그래서 맴버 변수는 기본적으로 'static' 메소드에서 사용할 수 없다.

        // 맴버변수 쓰는 방법: 여기서 자기 자신을 생성해서 사용하면 됨.
        Product product = new Product("product"); // 메모리가 할당이 됨.
        System.out.println(product.productName);

        System.out.println(autoIncrement); // 'static' 공간에 메모리 할당이 되어있어서 'static' 메소드 내에서 사용 가능

    }


}
