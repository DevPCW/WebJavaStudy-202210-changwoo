package j18_제네릭;

import java.util.Date;

public class DataController {

    public static void main(String[] args) {
        Date now = new Date();

//        ResponseData responseData = new ResponseData("날짜 저장 성공!", now.toString());
//        System.out.println(responseData);
//
//        ResponseData responseData2 = new ResponseData("번호 저장 성공!", 10); // int 자료형도 받고 싶을 때
        // 현재 지식으로는 int 자료형도 'ReponseData' 에 선언되어야 한다.
        // 그래서 date 변수의 자료형이 유동적으로 변해야한다.
        // ResponseData 클래스 명 뒤에 <T>, 맴버변수 자료형에 T를 붙이면 됨.
        // System.out.println(responseData);


        // 위 방법으로 하면 번거롭기 때문에
        // 생성할 때 클래스 뒤에 자료형클래스를 붙여주면됨.
        ResponseData<String> responseData = new ResponseData<String>("날짜 저장 성공!", now.toString());
        System.out.println(responseData);

        ResponseData<Integer> responseData2 = new ResponseData<Integer>("번호 저장 성공!", 10);
        System.out.println(responseData2);

        ResponseData<Date> responseData3 = new ResponseData<Date>("번호 저장 성공!", now);
        System.out.println(responseData3);

    }

}
