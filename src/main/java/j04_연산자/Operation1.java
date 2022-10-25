package j04_연산자;

public class Operation1 {


    // 증감 연산자: 대입까지 포함.
    public static void main(String[] args) {
        int num = 10;
        num = num + 1;

        System.out.println(num);
        System.out.println(num++); // 후증가: 지금 이 턴 후에 증가 시켜라.
        System.out.println(num);

    }
}
