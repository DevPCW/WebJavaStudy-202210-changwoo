package j11_배열;

public class ArrayTest1 {

    public static void main(String[] args) {

        int[] numArray = new int[10]; // 하나의 이름(변수)로 int 정수 10개를 묶어 놨다.
        // new라고 하면 무조건 힙메모리 공간을 할당하는 동적 메모리 할당.
        // (4byte짜리 공간 10개가 묶여있음 0부터 9까지)
        // 배열도 자료형 형태임.
        // 생성된 주소를 numArray에 넣음.
//        이렇게 하면 변수명을 다 다르게 지정해야..귀찮으니
//        int num1 = 10;
//        int num2 = 11;
//        int num3 = 12;
//        int num4 = 13;
//        int num5 = 14;
//        int num6 = 15;

        int index = 9;
        numArray[index] = 10;

//        numArray[0] = 10; // 0번 순서에 있는 공간에 접근을 해서 그 공간에 10을 넣음.

        for(int i = 0; i < 10; i++) { // 배열은 반복문 쓸 수 있다.
            System.out.println(numArray[i]);
            // 0~8번 순서까지는 공간만 만들어져서 초기값 0만 출력됨.

        }

    }

}
