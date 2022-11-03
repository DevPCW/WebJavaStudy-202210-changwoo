package j17_스태틱.싱글톤;

public class ProductView {
    private static ProductView instance = null; // instance에 ProductView 의 주소값을 넣을 수 있음.

    private ProductView() {}
    
    
    // 디자인 패턴 중 싱글톤의 공식(밑에서 클래스 명만 바꿔가며 사용하면 됨.)
    public static ProductView getInstance() { // 'private' 이라 외부로 못들고감. 그래서 만든게 getInstance();
        if(instance == null) { // 객체 생성이 안되었으면,
            instance = new ProductView(); // 여기서 생성을 해서 'instance' 에 값 대입.
        }
        return instance; // 그걸 리턴
        
        
        // 두번째는 한 번 스태틱 영역에 생성되었기 때문에 if로 안가고, 계속 'instance' 를 돌려줌.
        // 'getInstance' 는 스태틱 메소드이기 때문에 어디서든 (접근 가능)
        // getInstance 메소드 호출 가능: 자기 자신의 주소값이 들어가 있음.
        // 이게 싱글톤인데, 스태틱이 아니라면 여러 클래스들끼리 객체를(주소) 전달할 때 중복해서 줄줄이로 계속 전달해야하는 불편함이 생김.
        // ProductView.getInstance(); <= 다른 곳에서 이런식으로 쓸수 있음.
    }

    public void showMainView() {
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView() {
        System.out.println("주문 정보를 보여주는 화면");
    }
}
