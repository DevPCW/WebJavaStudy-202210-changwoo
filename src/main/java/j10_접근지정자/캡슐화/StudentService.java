package j10_접근지정자.캡슐화;

// 캡슐화: 게터 세터
// 응집도는 높아야하고, 결합도는 낮아야 함.
public class StudentService {

    public void registerStudent() {
        System.out.println("[ 학생 정보 등록 메뉴 ]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("김준일"); // 외부에서 사용할 일 이 없는 메소드: 중복체크는 등록할 때 쓰는 거니깐

        System.out.println("학생정보를 등록합니다.");

    }

    private boolean doubleCheckStudent(String studentName) { // 내부에서만 사용 할 수 있게 private 설정.

        if(studentName.equals("김준일")) { // 문자열 동등 비교방법.
            return false;
        }

        return true;

    }

}
