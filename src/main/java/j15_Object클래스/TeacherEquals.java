package j15_Object클래스;

public class TeacherEquals {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
//        Teacher teacher2 = new Teacher("김준일", "코리아아이티");

        j15_Object클래스.equals.Teacher teacher2
                = new j15_Object클래스.equals.Teacher("김준일", "코리아아이티");

//        System.out.println(teacher1 == teacher2); // 자료형 자체가 다른거임.ex("김준일" == 1)
        System.out.println(teacher1.equals(teacher2)); // false임. 왜냐하면 지금 equals 매소드가 Object클래스 꺼임.

        // 클래스 객체가 서로 다르더라도 안에 들어있는 값이 똑같으면 true
        System.out.println(teacher1.hashCode() == teacher2.hashCode());


//        public boolean equals(Object obj) {
//            return (this == obj);
//        }

        // Teacher 클래스 가서 Override 해줘야함.

        // 그 후에 true값으로 바뀜.




        // -------------------------------------------------------------------------------------------------------------
        //[ 비교 ]
        // == 주소 비교
        // equals 동일 객체일 때 true
        // hashCode 동일 매개변수 값 true

    }
}
