package j09_클래스;

/**
 * Properties(속성) - (멤버)변수
 * schoolName
 * studentCode
 * name
 * studentYear
 *
 * Function(기능) - (멤버)메소드
 * increaseStudentYear() - 호출시에 현재 학년을 1학년 증가(최대 5학년)
 * showStudentInfo() - 학생 정보 출력
 *
 * 부산대학교
 * 20220001
 * 2
 * 김준일
 */

public class Student {
    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    Student() {

    }

    void increaseStudentYear() {
        studentYear++;
        if(studentYear > 5) {
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            studentYear--;
            return; // 보이드에서 리턴을 쓸때는 아무것도 반환을 하지 않음. break;같은 느낌
        }
        showStudentInfo();
    }

    void increaseStudentYear(int year) {
        studentYear += year;
        if(studentYear > 5) {
            System.out.println(year + "학년을 더하면 " + studentYear + "학년이 되어서 5학년을 넘어섭니다.");
            System.out.println();
            studentYear -= year;
            return;
        }
        showStudentInfo();
    }

    void showStudentInfo() {
        System.out.println("학교: " + schoolName);
        System.out.println("학번: " + studentCode);
        System.out.println("학년: " + studentYear);
        System.out.println("이름: " + name);
        System.out.println("------------------------");
    }

}

