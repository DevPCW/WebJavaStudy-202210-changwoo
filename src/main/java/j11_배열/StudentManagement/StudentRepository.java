package j11_배열.StudentManagement;

public class StudentRepository {
    private Student[] students; // 1. student 배열이라는 것은 학생의 객체를 담을 수 있는 것.

    // 배열 또한 매개변수로 받을 수 있음. StudentRepository(Student[] students)
    public StudentRepository() {
        students = new Student[0]; // 2. 10이라고 해서 10명의 학생을 생성해서 넣을 수 있는 공간을 만드는 것.
    }


    public void addStudent(Student student) {
        int index = indexOfEmpty();

        if(index == -1) { // 공간이 없다.
            index = increaseArray(); // 이게 increase -> 이렇게 하면 늘어남. 인덱스에 덮음.
        }

        students[index] = student;


    }

    private int indexOfEmpty() { // 몇번째 공간이 비었다는 것을 알려줌. // 공간이 없으면 생성하겠다.
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) { // 3. 공간(주소)에서 공간이 비어있다는 뜻: null.
                return i; // 공간이 있을 때 i
                // return i 를 만나지 않으면 무조건 return -1을 만남.
                // 반복을 돌다가 공간이 비어있는 것을 확인하면 그 해당 번호를 리턴한다는 뜻.
                // return i 를 만나면 반복을 빠져나감; return과 반복이 동시에 일어남.
            }
        }
        return -1; // 실행이 안되면. 리턴에 -1. -1을 받으면 공간이 없다.
    }

    private int increaseArray() {
        Student[] tempArray = new Student[students.length + 1]; // 이 배열은 공간이 원래 길이보다 1이 커야함. // 임시 Array
        for(int i = 0; i < students.length; i++) {
            tempArray[i] = students[i]; // 0번 어레이에서 1번으로 옮기고...
        }
        students = tempArray; // 다옮기고 나서 tempArray를 대입. -> 새롭게 공간이 늘어남.

        return tempArray.length - 1; // 마지막에 비어있는 인덱스 번호 // 0부터 시작하니깐 ; 0,1,2 이면 2는 3번째 길이

    }


}
