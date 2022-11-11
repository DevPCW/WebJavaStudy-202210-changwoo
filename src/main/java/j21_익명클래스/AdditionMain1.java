package j21_익명클래스;

public class AdditionMain1 {

    public static void main(String[] args) {

        // Addition 은 interface
        // 인터페이스는 생성할 수없어서 인터페이스를 구현한 클래스를 만들어줘야함.
        Addition<String> stringAddition = new AdditionImpl<String>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        Addition<Integer> integerAddition = new Addition<Integer>() {

            @Override
            public Integer add(Integer value) {

                return null;
            }
            // 인터페이스를 정의함과 동시에 주소를 변수에 바로 넣음(생성).
            // 클래스 정의를 안에서 바로 함.(클래스인데, 1회용 틀)
        };
    }
}
