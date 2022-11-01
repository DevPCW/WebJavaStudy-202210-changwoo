package j13_추상화.인터페이스;

/*
 * Interface(인터페이스)
 * 1. 기본적으로 모든 메소드가 추상 메소드로 정의된다.
 * 2. 일반 메소드를 정의하기 위해서는 default 키워드를 사용하여야 한다.
 * 3. 생성자 정의 불가능.
 * 4. 일반 변수 선언 불가능.
 * 5. 상수는 선언할 수 있다.(접근지정자 public 사용)
 */

public abstract class Button implements Press, Up, Down {
    @Override
    public void onDown() {}

    @Override
    public void onUp() {}

    @Override
    public void onPressed() {}

//    private String name;  -> [변수 선언]

//    public button() {  -> [생성자]
//
//    }
//

//    public default void pop() {  -> [일반메소드]
//
//    }

}
