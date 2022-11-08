package j19_컬렉션;

import java.util.*;

public class StringSet {

    public static void main(String[] args) {

        Set<String> strSet = new HashSet<>();

        List<String> strList = new ArrayList<String>();
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일");



        // 값 추가
        strSet.add("김준일"); // 'set' 은 값의 중복 허용x => 그 점을 이용해서 list에서 중복을 제거할 때 이용함.
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        System.out.println(strSet); // 순서대로 적었는데, 값이 순서대로 안들어감.

        strSet.addAll(strList); // list 에는 순서가 있지만, set 에 넣으면 셋의 자료 구조형을 따르면서 뒤죽박죽으로 값이 들어감.

        System.out.println(strSet);

        // 값 조회(하나씩 하나씩 다 꺼내야 함. 무조건 반복이 들어가야 함.)
        String searchName = "김준이";

        /*
            'strSet' 에 'searchName' 이 있으면 'true' , 없으면 'false' 를 출력하는 프로그램 작성하기
         */


        boolean isTrue = false; // 'flag' 를 하나 줘야함.

        for(String name : strSet) {
            if(name.equals(searchName)) {
                isTrue = true;
                break;
            }
        }

        System.out.println(isTrue);

        // 값 수정
        /*
            'set' 에서 송아셀 학생의 이름을 찾아서, 그 학생의 이름을 남강석 학생으로 바꿔라
         */



        // 'set' 은 값 자체가 키값이기 때문에 값을 삭제하고 추가해야함.

//        strSet.remove("송아셀");

        String searchName2 = "송아셀";

//        for(String name : strSet) {
//            if(!name.equals(searchName2)) {
//                strSet.add("남강석");
//                break;
//            }
//        }

        for(String name : strSet) {
            if(name.equals(searchName2)) {
                strSet.remove(searchName2);
                strSet.add("남강석");
                break;
            }
        }
        System.out.println(strSet);

        searchName2 = "김준일";

        System.out.println(strSet.contains(searchName2)); // 포함하고 있나?
        if(strSet.contains(searchName2)) { // 반복을 돌릴 필요가 없어짐.
            strSet.remove(searchName2);
            strSet.add("김준이");
        }
        System.out.println(strSet);

    }
}
