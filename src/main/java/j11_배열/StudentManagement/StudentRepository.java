package j11_배열.StudentManagement;


// 데이터를 저장
public class StudentRepository {
    private Student[] students; // 1. student 배열이라는 것은 학생의 객체를 담을 수 있는 것.

    // 배열 또한 매개변수로 받을 수 있음. StudentRepository(Student[] students)
    public StudentRepository() {
        students = new Student[0]; // 2. 10이라고 해서 10명의 학생을 생성해서 넣을 수 있는 공간을 만드는 것.
    }

    // 학생이 늘어날때마다 의자에 앉힘
    public void addStudent(Student student) {
        int index = indexOfEmpty(); // 남는 의자가 있는지 확인 // 빈자리가 index에 대입

        if(index == -1) { // 공간이 없을 때.
            index = increaseArray(); // 이게 increase -> 이렇게 하면 늘어남. 인덱스에 덮음.
        }

        students[index] = student; // 그 공간에다가 새로 만든 매개변수 student를 받아서 index에 대입.


    }

    private int indexOfEmpty() { // 반복을 돌면서 몇번째 공간이 비었다는 것을 알려줌. // 공간이 없으면 생성하겠다.
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) { // 3. 공간(주소)에서 공간이 비어있다는 뜻: null.
                return i; // 공간이 있을 때 i
                // return i 를 만나지 않으면 무조건 return -1을 만남.
                // 반복을 돌다가 공간이 비어있는 것을 확인하면 그 해당 번호를 리턴한다는 뜻.
                // return i 를 만나면 반복을 빠져나감; return과 반복이 동시에 일어남.
            }
        }
        return -1; // 빈자리를 못찾으면 // 실행이 안되면. 리턴에 -1. -1을 받으면 공간이 없다.
    }

    private int increaseArray() {
        Student[] tempArray = new Student[students.length + 1]; // 이 배열은 공간이 원래 길이보다 1이 커야함. // 임시 Array
        for(int i = 0; i < students.length; i++) {
            tempArray[i] = students[i]; // 0번 어레이에서 1번으로 옮기고...
        }
        students = tempArray; // 다옮기고 나서 tempArray를 대입. -> 새롭게 공간이 늘어남.

        return students.length - 1; // 마지막에 비어있는 인덱스 번호 // 0부터 시작하니깐 ; 0,1,2 이면 2는 3번째 길이

    }

    public Student[] getStudents() { // private Student[] students 배열을 들고와줌.
        return students; // 멤버 변수에 담겨있는 주소를 반환
    }

    public int findStudentByName(String name) { // 이름을 들고와서 배열안에서 찾아야함. 인덱스 번호 찾음.
        for(int i = 0 ; i < students.length; i++) { // 가지고 올 때 마다 그 주소가 null이 아닌지 체크를 해야함.
            if(students[i] !=null) {
                if(students[i].getName().equals(name)) {
                    return i; // 배열에 번호(i)가 있는데 여기 이 학생이 들어있다고 리턴
                }
            }
        }
        return -1;
    }


    public Student getStudent(int index) { // 학생의 위치를 가져다 줌.
        return students[index];

    }

    public Student removeStudent(int index) { // 학생 삭제
        Student student = students[index]; // 배열에서 학생을 꺼냄
        students[index] = null; // 그 배열안에 학생을 지움.(학생의 정보가 지워지는 것은 아님)
        return student; // 비워놓고 학생을 메모리 안에 남아있는 주소를 리턴.
    }

    public Student updateStudent(int index, Student updateStudent) { // 수정: 객체도 같이 받음.
        Student student = students[index]; // 이름으로 찾은 학생을 가져옴
        student.updateStudent(updateStudent);
        return student; // 새롭게 수정된 것을 반환
    }


}
