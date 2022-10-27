package j09_클래스;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.schoolName = "부산대학교";
        student1.studentCode = 20220001;
        student1.studentYear = 1;
        student1.name = "김준일";


        student2.schoolName = "서울대학교";
        student2.studentCode = 20220002;
        student2.studentYear = 2;
        student2.name = "김준이";


        student1.showStudentInfo();
        student2.showStudentInfo();


//        System.out.println("<<<<<< 학년증가 반복 >>>>>>");
//        for(int i = 0; i < 10; i++) {
//            student1.increaseStudentYear();
//        }

        student1.increaseStudentYear(2);
        student1.increaseStudentYear(2);
        student1.increaseStudentYear(2);

        student2.increaseStudentYear(5);

    }

}
