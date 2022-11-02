package j15_Object클래스;

// 뒤에 s가 붙는 클래스들은 (Objects, Collections, Arrays): 기능을 다루는 클래스들.

public class Main {

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();

        int hashCode = objectTest.hashCode(); // ObjectTest 클래스에는 텅 비어있는데, 메소드 호출이 가능.

        System.out.println(hashCode); // hastCode: 해당 객체의 실 주소 값.
        System.out.println(Integer.toHexString(hashCode)); // 정수를 16진수로 바꿔라.

        System.out.println(objectTest);


    }
}
