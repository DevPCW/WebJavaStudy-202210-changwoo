package j05_Scanner;

import java.util.Scanner;

public class Input3 {

    /*
        이름: 김준일              name
        나이: 29                  age
        주소: 부산 동래구 사직동  address
        연락처: 010 9988 1916     phone

        사용자의 이름은 김준일이고 나이는 29입니다.
        주소는 부산 동래구 사직동이며 연락처는 010 9988 1916입니다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String address = null;
        String phone = null;

        System.out.print("이름: ");
        name = scanner.next(); // spacebar 와 enter가 먹히지 않음. : 엔터를 입력하면 버퍼가 닫히고 버퍼에 엔터 값은 남아있음.

        System.out.print("나이: ");
        age = scanner.nextInt();

        scanner.nextLine(); // 버퍼 때문에 필요: 버퍼 -> 한번에 묶어서 쓰기 위한 용도 * 버퍼가 없으면 김 -> ㄱㅣㅁ
        // 끊어주는 역할이 spacebar와 enter임.(nextLine은 이 둘이 [문자로 인식]들어감.)

        System.out.print("주소: ");
        address = scanner.nextLine(); // 위의 scanner.nextLine();이 없으면, 버퍼가 비어짐

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "입니다.");
        System.out.println("주소는 " + address + "이며 연락처는 " + phone + "입니다.");


//        System.out.print("이름: ");
//        String name = scanner.nextLine();
//
//        System.out.print("나이: ");
//        int age = scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.print("주소: ");
//        String address = scanner.nextLine();
//
//        System.out.print("연락처: ");
//        int phone = scanner.nextInt();
//
//        System.out.println();
//
//        System.out.println("이름: " + name);
//        System.out.println("나이: " + age);
//        System.out.println("주소: " + address);
//        System.out.println("연락처: " + phone);
//        System.out.println("사용자의 이름은 김준일이고 나이는 29입니다.");
//        System.out.println("주소는 부산 동래구 사직동이며 연락처는 010 9988 1916입니다.");



    }
}
