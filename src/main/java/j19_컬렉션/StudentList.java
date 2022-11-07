package j19_컬렉션;

import java.util.ArrayList;
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

        for(int i=0; i<students.size(); i++) { // 굳이 i 인덱스 찾아서 하는 거보다 'foreach' 써서 하는게 더 편함.
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







    }
}
