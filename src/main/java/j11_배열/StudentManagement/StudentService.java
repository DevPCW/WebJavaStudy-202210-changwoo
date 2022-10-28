package j11_배열.StudentManagement;

import java.util.Scanner;

public class StudentService {

    private Scanner scanner; // 스캐너를 멤버변수에 선언: Scanner도 자료형임.

    public StudentService(Scanner scanner) { // 생성할 때 스캐너 객체를 불러옴. 값: new Scanner(system.in);
        this.scanner = scanner;
    }

    public void resisterStudent() { // 생성이 됐다는 가정 하에 scanner. 주소 참조 해서 사용할 수 있음.
        String name;
        int kor;
        int eng;
        int math;

        System.out.println("[ 학생 정보 등록 ]");
        System.out.print("이름: ");
        name = scanner.nextLine();

        System.out.print("국어: ");
        kor = scanner.nextInt();

        System.out.print("영어: ");
        eng = scanner.nextInt();

        System.out.print("수학: ");
        math = scanner.nextInt();

        Student student = new Student(name, kor, eng, math);


    }

}
