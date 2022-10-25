package j07_반복;

// 일정한 규칙을 가지고 순차적으로 증가 시킬 때 for문
// while은 해당 조건이 될 때 멈춰라.
public class Loop6 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }

        int i = 0; // while 은 바깥에서 선언
        
        while (i < n) { // 반복 탈출 조건
            System.out.println(i + 1);
            i++;

        }

    }
}
