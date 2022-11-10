package j19_컬렉션;

import java.util.*;

public class StudentSet {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        System.out.println(students);


        /*  < Practice >
            1. 김혜진 학생의 학번을 출력하세요.
            2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
            3. 20220001 학번이 존재하면, 해당 학생을 삭제하세요.

            4. set -> 'list' 로 변환(뒤죽박죽 된 상태로 들어가게 됨)
                해당 'list' 를 학번 순서에 맞게 정렬하시오.
         */

        // 1. 김혜진 학생의 학번 출력
        String searchName = "김혜진";

        for(Student student : students) {
            if(searchName.equals(student.getName())) {
                System.out.println(searchName + " 학생의 학번: " + student.getId());
                break;
            }
        }

        System.out.println("---------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "-----------------------------");

        // 2. 20220004 학번을 가진 학생의 이름을 설민수로 변경(걍 setName 써도 됨.)

        int searchId = 20220004;

        for(Student student : students) {
            if(searchId == student.getId()) {
                students.remove(student);
                students.add(new Student(20220004, "설민수"));
                break;
            }
        }
        System.out.println(students);

        System.out.println("---------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "-----------------------------");

        // 3. 20220001 학번이 존재하면, 해당 학생을 삭제

        searchId = 20220001;

        for(Student student : students) {
            if(searchId == student.getId()) {
                students.remove(student);
                break;
            }
        }
        System.out.println(students);

        System.out.println("---------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "--------------------------------------" +
                "----------------------------------");

        // 4. set -> 'list' 로 변환 => 해당 'list' 를 학번 순서에 맞게 정렬.
        int i = 20220000;
        int j = 0;

        List<Student> sortStudents = new ArrayList<Student>();
        while(j <= students.size()) {
            j++;
            for(Student student : students) {
                if(student.getId() == i) {
                    sortStudents.add(student);
                }
            }
            i++;
        }

        System.out.println(sortStudents);
        System.out.println("<<<<<<<< 정렬 >>>>>>>>");

        int cmpId = 20220000;
        j = 0;


        for(int i1 = 0; i1 < students.size(); i1++) {
            cmpId++;
            for(Student student : students) {
                if(student.getId() == cmpId) {
                    sortStudents.add(student);
                }
            }
        }

        System.out.println(sortStudents);
        System.out.println("<<<<<<<< 정렬 >>>>>>>>");





    }
}
