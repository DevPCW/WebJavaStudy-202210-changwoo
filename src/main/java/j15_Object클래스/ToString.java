package j15_Object클래스;

public class ToString {

    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("김준일", "부산");

        // 둘 다 동일한 출력 결과 값.
        System.out.println(objectTest);
        System.out.println(objectTest.toString());

        // toString을 타고 들어가면 toString의 메소드가 정의 되어 있는데, 리턴 값이 String임.
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }

        // toString(); 메소드의 리턴 값이 String 이기 때문에 이렇게 사용 가능.
        String str = objectTest.toString();
        System.out.println(str);
        System.out.println(objectTest.showInfo());

        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준이", "부산교육대학원");

        System.out.println(teacher1);
        System.out.println(teacher2);





    }

}
