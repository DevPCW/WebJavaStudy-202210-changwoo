package j10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20220001, "김준일");

        sam.showInfo();
        sam.setName("김준이"); // 새로운 sam의 name 값을 넣겠다.
        sam.showInfo();

        System.out.println(sam.getCode()); // 안에 있는 sam의 코드 값 들고 오고 싶다.


    }



}
