package j17_스태틱.싱글톤;

public class ViewMain {

    public static void main(String[] args) {
//        ProductView productView = new ProductView(); // 생성자가 'private' 이라서 외부에서 생성되지 않음.


        // 이렇게 써도 되고
//        ProductView productView = ProductView.getInstance();
//
//        productView.showMainView();
//        productView.showMainView();

        // 이렇게 써도 됨.
        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();
    }

}
