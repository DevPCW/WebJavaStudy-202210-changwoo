package j19_컬렉션;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>(); // 'ArrayList' 를 List 인터페이스에 업캐스팅
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        // 김규민 학생의 학번 찾기.
        String searchName = "김규민";

        for(int i = 0; i < students.size(); i++) { // 굳이 i 인덱스 찾아서 하는 거보다 'foreach' 써서 하는게 더 편함.
            Student student = students.get(i);
            if(students.get(i).getName().equals(searchName)) {
                System.out.println(searchName + "학생의 학번: " + student.getId());
                break;
            }
        }

        for(Student student : students) {
            if(student.getName().equals(searchName)) {
                System.out.println(searchName + "학생의 학번: " + student.getId());;
                break;
            }
        }

        int searchId = 20220002; // 이 학생을 찾아서 지우고 학생 리스트 출력하기

        // 일반 for 문
        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getId() == searchId) {
                students.remove(i);
                break;
            }
        }
        System.out.println(students);


        // foreach 문
        for(Student student : students) {
            if(student.getId() == searchId) {
                students.remove(students.indexOf(student));
                break;
            }
        }
        System.out.println(students);


        /*
        id = 20220003 학생을 찾아서 그 학생의 이름이 김규민이면 해당 학생의 이름을 김경민으로 바꿔라.
         */

        searchId = 20220003;


        for(Student student : students) {
            if(student.getId() == searchId && student.getName().equals("김규민")) {
                student.setName("김경민");
                break;
            }
        }
        System.out.println(students);

        System.out.println("---------------------------------");

        for(Student student : students) {
            System.out.println(student);
        }


        System.out.println("---------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "----------------------------------");

        searchId = 20220004;

        /*
        박경효를 박창우로 변경: Iterator 반복자를 사용해서 바꾸기

         */

        Iterator<Student> iterator = students.iterator(); // 'students' 객체를 'iterator' 로 변경.
        while(iterator.hasNext()) { // 다음이 있는지 조건으로 사용
            Student student = iterator.next(); // 꺼내서 'student' 에 담음
            if(student.getId() == searchId) { // 꺼낸 것들 중에 id가 searchId와 같으면
                student.setName("박창우"); // 그것을 수정
                break;
            }
        }
        System.out.println(students);

        System.out.println("---------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "----------------------------------");

        // 뒤에서 부터 값 들고오기
        List<Student> reverseStudents = new ArrayList<Student>();

//        for(int i = 0; i < students.size(); i++) {
//            reverseStudents.add(students.get(students.size() - 1 - i));
//        }
//
//        System.out.println(reverseStudents);

        for(Student student : students) {
            reverseStudents.add(0, student); // 0번에 계속 넣으면 뒤로 밀려남.
        }

        System.out.println(reverseStudents);

        System.out.println("---------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "----------------------------------");


        Collections.reverse(reverseStudents); // 위에서 뒤집힌 걸 다시 원상 복귀

        System.out.println(reverseStudents);

        System.out.println("---------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "----------------------------------");

        /*
            idList
            nameList

            'idList' 에는 'id' 만
            'nameList' 에는 'name' 만

            두 개의 리스트를 출력하기
         */

        List<Integer> idList = new ArrayList<Integer>();
        for(Student student : students) {
            idList.add(student.getId());
        }
        System.out.println(idList);

        List<String> nameList = new ArrayList<String>();
        for(Student student : students) {
            nameList.add(student.getName());
        }
        System.out.println(nameList);

        students.clear(); // 해당 'students' 리스트가 비워짐

        System.out.println(students);


        for (int i = 0; i < idList.size(); i++) {
            Student student = new Student(idList.get(i), nameList.get(i)); {
            students.add(student);
            }
        }

        System.out.println(students);





    }
}
