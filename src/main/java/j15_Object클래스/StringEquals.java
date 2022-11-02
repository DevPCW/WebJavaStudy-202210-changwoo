package j15_Object클래스;

// String 클래스도 Object 클래스를 상속받고 있음.
// String 은 Object 클래스의 equals(); 메소드를 Override해서 사용하고 있다.
//
// [ equals 메소드를 오버라이드 ]
//public boolean equals(Object anObject) { // 매개변수 자리에 여러 자료형을 받고 싶을 때 Object를 사용함. 업캐스팅.
//        if (this == anObject) { // 리턴 타입에 Object 모든 자료형 리턴 가능. 대신 다운 캐스팅 해야함.
//          return true;
//        }
//        if (anObject instanceof String) {
//           String aString = (String)anObject; // 다운캐스팅
//          if (coder() == aString.coder()) { // value: 자기 자신, aString.value: 비교 대상.
//               return isLatin1() ? StringLatin1.equals(value, aString.value)
//                                 : StringUTF16.equals(value, aString.value);
//          }
//        }
//        return false;
//    }

// 메소드 안에 내용이 바뀜.
public class StringEquals {

    public static void main(String[] args) {
        int i = 10; // 리터럴 상수: 어딘가에 이미 선언되어져 있음.

        String name1 = "김준일"; // 생성한게 아님. // 이미 선언된 리터럴 값들이 들어간 배열의 주소가 들어감.
        String name2 = "김준일";
        String name3 = new String("김준일"); // 새로운 주소 생성
        String name4 = new String("김준일"); // 위와 다른 새로운 주소 새성

        System.out.println(name1 + ", " + name2 + ", " + name3);

        System.out.println(name1 == name2); // == 는 주소 비교.

        System.out.println(name1 == name3);

        System.out.println(name3 == name4);

        System.out.println(name1.equals(name3)); // 문자열 동등 비교.

    }
}
