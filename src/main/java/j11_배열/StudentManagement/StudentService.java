package j11_배열.StudentManagement;

import java.util.Scanner;


// student 기능 관리 -> 레파지토리에서 정보를 들고와서 처리.
public class StudentService {

    private Scanner scanner; // 스캐너를 멤버변수에 선언: Scanner도 자료형임.
    private StudentRepository studentRepository;
    
    // service의 생성자
    // service를 생성할 때 스캐너, 레파지토리의 주소 값이 들어가있음.
    // 그래서 StudentService는 얘네들 주소 참조가 가능
    public StudentService(Scanner scanner, StudentRepository studentRepository) { // 생성할 때 스캐너 객체를 불러옴. 값: new Scanner(system.in);
        this.scanner = scanner;
        this.studentRepository = studentRepository;
    }

    public void registerStudent() { // 생성이 됐다는 가정 하에 scanner. 주소 참조 해서 사용할 수 있음.
        String name;
        int kor;
        int eng;
        int math;

        System.out.println("[ 학생 정보 등록 ]");
        System.out.print("이름: ");
        name = scanner.nextLine(); // 스캐너 생성안해도 주소를 알고 있기 때문에 메인에서 생성된 스캐너 객체에게 명령을 내려서 스캐너 기능을 쓸 수 있는 거임

        System.out.print("국어: ");
        kor = scanner.nextInt();

        System.out.print("영어: ");
        eng = scanner.nextInt();

        System.out.print("수학: ");
        math = scanner.nextInt();
        scanner.nextLine(); // 버퍼에 엔터가 남아있어서 날려줘야함.

        Student student = new Student(name, kor, eng, math); // 학생 객체 생성 되서 그 주소를 student에 저장 -> 그걸 studentRepository에게 줌.

        studentRepository.addStudent(student); // 학생들을 배열에 집어넣어 줌.

        // 서비스에서 학생을 만들어서 레파지토리에 던짐.
        // 배열에 넣고 싶은데 공간이 없어서. 배열의 크기를 보고 늘려서(알고리즘) -> index에 대입


    }

    public void showStudents() { // 전체 학생들을 출력
        Student[] students = studentRepository.getStudents(); // 레파지토리한테 가지고 있는 배열 주소를 부탁(배열을 가지고 있음)
        // 객체전달은 전부 주소임. // 객체지향프로그램. 객체들이 서로 주소를 주고 받음.

        for(int i = 0; i < students.length; i++) {
            Student student = students[i]; // 학생을 하나씩 꺼냄.
            if(student != null) {
                student.showStudentInfo();
            }
        }
    }

    private int indexOf() { // 이름으로 찾는거
        String name;
        
        System.out.print("이름을 입력하세요: ");
        name = scanner.nextLine();

        int index = studentRepository.findStudentByName(name);

        return studentRepository.findStudentByName(name);
    }

    public void showStudent() { // 학생 한 명
        System.out.println("[ 학생 정보 이름으로 조회 ]");
        int index = indexOf();

        if(index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return; // 바로 블록 밖 코드 실행 안되고 조건문 나가버림.
        }

        studentRepository.getStudent(index).showStudentInfo();// 학생 정보 가져와주고 // 출력함.
        System.out.println("조회 완료!");
        System.out.println();
    }

    public void deleteStudent() {
//        String name;
//        System.out.println("[ 학생 정보 이름으로 조회 ]");
//        System.out.print("이름을 입력하세요: ");
//        name = scanner.nextLine();
//
//        int index = studentRepository.findStudentByName(name);
        System.out.println("[ 학생 정보 이름으로 삭제 ]");
        int index = indexOf(); // 이거 한줄로 위의 코드가 실행되서 주석처리

        if(index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }

        studentRepository.removeStudent(index).showStudentInfo();
        System.out.println("삭제 완료!");
        System.out.println();

    }

    public void modifyStudent() {
        System.out.println("[ 학생 정보 이름으로 수정 ]");
        int index = indexOf();
        int kor;
        int eng;
        int math;


        if(index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }

        System.out.print("국어: ");
        kor = scanner.nextInt();

        System.out.print("영어: ");
        eng = scanner.nextInt();

        System.out.print("수학: ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student updateStudent = new Student(null, kor, eng, math);

        studentRepository.updateStudent(index, updateStudent);
        System.out.println("수정 완료!");

    }


}
