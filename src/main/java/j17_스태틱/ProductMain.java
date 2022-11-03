package j17_스태틱;

/*      문제
        1. serialNumber = 20220001, productName = "스타벅스 블랙 텀블러1"
        2. serialNumber = 20220002, productName = "스타벅스 블랙 텀블러2"
        3. serialNumber = 20220003, productName = "스타벅스 블랙 텀블러3"
        4. serialNumber = 20220004, productName = "스타벅스 블랙 텀블러4"
        5. serialNumber = 20220005, productName = "스타벅스 블랙 텀블러5"
        상품이 생성 될 때마다 'serialNumber' 는 자동증가 되어야 함.
 */

public class ProductMain {

    public static void main(String[] args) {
        Product[] products = new Product[5];


//        for(int i = 0; i < products.length; i++) {
//            products[i] = new Product(20220001 + i, "스타벅스 블랙 텀블러" + (i + 1));
//
//        }

//        for(int i = 0; i < products.length; i++) {
//            products[i] = new Product("스타벅스 블랙 텀블러" + (i + 1)); // 생성할 때 이름만 -> String
//        }

        // 1. 생성할 때 productName만 보냄
        // 2. autoIncrement는 1씩 증가하게 됨.
        // 3. autoIncrement값이 serialNumber에 대입됨.
        //    (++autoIncrement는 생성 될 때마다 1씩 증가된 값이 유지가 되고 있음.)
        //    ( => 클래스1을 생성하고 클래스2를 생성할 때 클래스 2에
        //         스태틱 변수를 제외하고 새로운 주소의 공간안에 나머지들이 카피 됨.)
        // static => 공유하는 영역임.


        products[0] = new Product("스타벅스 블랙 텀블러" + 1);
        products[1] = new Product("스타벅스 블랙 텀블러" + 2);
        products[2] = new Product("스타벅스 블랙 텀블러" + 3);
        products[3] = new Product("스타벅스 블랙 텀블러" + 4);
        products[4] = new Product("스타벅스 블랙 텀블러" + 5);

        for(int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

}
