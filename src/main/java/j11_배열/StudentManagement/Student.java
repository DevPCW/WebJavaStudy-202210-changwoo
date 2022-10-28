package j11_배열.StudentManagement;

// 데이터: crud
// 정보를 담는 그릇
public class Student { // 학생의 정보를 담는 객체: Entity

    private String name;
    private int kor;
    private int eng;
    private int math;
    private int totalScore;
    private int avgScore;
    private char grade;

    public Student(String name, int kor, int eng, int math) { // 생성자를 통한 주입. // 전역 변수에 생성될 때 넣은 값 저장
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        calculation(); // 호출
    }

    public void updateStudent(Student updateStudent) {
        this.kor = updateStudent.kor;
        this.eng = updateStudent.eng;
        this.math = updateStudent.math;

        calculation();
    }

    // 메소드를 세분화해서 나누는 것 중요!
    // 메소드를 하나로 묶음으로써 응집도를 높임.
    // 유지 보수를 쉽게 할 수 있음.
    private void calculation() { // 전부 외부에서 사용 안해서 private
        setTotalScore();
        setAvgScore();
        setGrade();
    }

    private void setTotalScore() {
        totalScore = kor + eng + math;
    }

    private void setAvgScore() {
        avgScore = totalScore / 3;
    }

    private void setGrade() {
        if (avgScore > 89) {
            grade = 'A';
        }else if (avgScore > 79) {
            grade = 'B';
        }else if (avgScore > 69) {
            grade = 'C';
        }else if (avgScore > 59) {
            grade = 'D';
        }else {
            grade = 'F';
        }
    }

    public void showStudentInfo() {
        System.out.println("[ 학생 정보 출력 ]");
        System.out.println("이름: " + name);
        System.out.println("국, 영, 수: " + kor + ", " + eng + ", " + math);
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + avgScore);
        System.out.println("학점: " + grade);
    }
    public String getName() {
        return name;
    }
}
