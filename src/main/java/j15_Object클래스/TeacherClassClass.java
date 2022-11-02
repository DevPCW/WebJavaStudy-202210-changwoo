package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준일", "코리아아이티");

        Class t_class = teacher1.getClass(); // Class Class 를 들고옴. // getClass(); : Teacher 클래스의 정보를 들고오는 매소드
        // getClass();의 리턴은 Class 자료형임.
//        public final native Class<?> getClass();


        System.out.println(t_class.getSimpleName()); // 클래스 명.
        System.out.println(t_class.getName()); // 패키지 경로 포함.


        Field[] fields = t_class.getDeclaredFields(); // 선언된 변수 명. // 배열이니 반복 써서 확인.
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName()); // getType(); : 변수의 자료형.
        }

        Method[] methods = t_class.getDeclaredMethods(); // 선언된 메소드.
        for(int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getReturnType());
        }

        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher); // 해당 객체가 이 클래스로 만들어 졌나?
        System.out.println(teacher1.getClass() == Teacher.class); // 같은 객체인지. // instanceof를 안써도 됨.
        System.out.println(teacher2.getClass() == Teacher.class);

    }
}
