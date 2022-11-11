package j21_익명클래스;

import java.util.Collection;

public class AdditionImpl<T> implements Addition<T> {

    // Addition<T>의 public T add(T values); 추상메소드를 재정의
    @Override
    public T add(T values) {
        System.out.println(values + "데이터들을 합칩니다.");
        return values;

    }
}
