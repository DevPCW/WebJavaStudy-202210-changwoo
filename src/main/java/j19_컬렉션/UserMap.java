package j19_컬렉션;

import java.util.*;

public class UserMap {

    public static void main(String[] args) {

        Map<String, String> userMap = new HashMap<String, String>();

        userMap.put("username", "junil");
        userMap.put("password", "1234");
        userMap.put("email", "abcd@gmail.com");
        userMap.put("name", "김준일");

        // 문제
        /*

         */

//        String keyName1 = "username";
//        String keyName2 = "password";
//        String keyName3 = "email";
//        String keyName4 = "name";
//
//        String value1 = "junil";
//        String value2 = "1234";
//        String value3 = "abcd@gmail.com";
//        String value4 = "김준일";

//        Set<Map.Entry<String, String>> entry = userMap.entrySet();
//
//        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> e = iterator.next();
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        Set e = new HashSet();
//        System.out.println(e);

        Set<String> keySet = userMap.keySet(); // 'Map' 을 'Set' 으로 바꿈

        List<String> keyList = new ArrayList<String>();
        keyList.addAll(keySet); // 그걸(Map -> Set) 리스트로 바꿈(Map -> Set -> List)

        // => 리스트는 인덱스가 있으니 집어서 넣을 수 있음.
        // List 는 get() 메소드를 통해서 해당 순서를 들고 올 수 있음.
        String keyName1 = keyList.get(0); // keyName1 에 "password", "1234" 저장
        String keyName2 = keyList.get(1);
        String keyName3 = keyList.get(2);
        String keyName4 = keyList.get(3);

        String value1 = userMap.get(keyName1);
        String value2 = userMap.get(keyName2);
        String value3 = userMap.get(keyName3);
        String value4 = userMap.get(keyName4);



        System.out.println(userMap);


        System.out.println("------------------------------------------------------------------");

        System.out.println(keyName1 + " >> " + value1);
        System.out.println(keyName2 + " >> " + value2);
        System.out.println(keyName3 + " >> " + value3);
        System.out.println(keyName4 + " >> " + value4);





    }
}
