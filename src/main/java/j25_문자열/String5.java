package j25_문자열;

public class String5 {

    public static void main(String[] args) {

        String httpMethod = "Get";

        if(httpMethod.equalsIgnoreCase("gET")) { // 영문자를 대소문자 구분 없이 무시하고, 문자열 비교
            System.out.println("get요청입니다.");
        }else {
            System.out.println("get요청이 아닙니다.");
        }

    }
}
