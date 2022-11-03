package j17_스태틱;


/*
 * 'static' 을 쓰게 되면 생성을 하지 않고도 값을 불러 올 수 있음.
 * 보통 'interface' 에서 값을 선언 해놓고 static 사용.
 * (값 확인: ProductMainClone)
 */

public interface PathRepository {
    // 'interface'는 변수 선언 불가 => 상수 선언만 가능.
    public static final String PRODUCT_IMG_PATH = "C:/upload/product/";
    public static final String PROFILE_IMG_PATH = "C:/upload/profile/";
    public static final String MAIN_IMG_PATH = "C:/upload/main/";
}
