package j19_컬렉션;

import java.util.*;

public class StringMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);
        System.out.println(list.get(3));


        // 'put' 을 사용하여 값 추가
        // list 는 0부터 시작이지만, map 은 키 값을 잡아서 원하는대로 검색 할 수 있다. (key 값의 해시데이터를 기준으로 정렬)
        map.put("kor2022000-j", "김준일");
        map.put("kor2022000-l", "이동빈");
        map.put("kor2022000-d", "도정민");
        map.put("kor2022000-c", "최해혁");
        map.put("kor2022000-j2", "김준일");

        System.out.println(map);
        System.out.println(map.get("kor2022000-d")); // get 메소드 존재 => 원하는 키 값을 통해 값을 찾을 수 있음.


        // 문제
        /*
            kor2022000-c 학번의 학생의 이름을 김완준으로 변경
         */

        String searchId = "kor2022000-c";

        // 'put' 을 사용하여 값 변경
        map.put(searchId, "김완준"); // 덮어 써버림. 키 값은 고유하기 때문.
        System.out.println(map);

        // 'replace' 를 사용하여 값 수정
        map.replace(searchId, "이성욱"); // list set(); 메소드와 동일
        System.out.println(map);

        // 'remove' 를 사용하여 값 삭제
        map.remove(searchId); // 키를 삭제하면 값도 같이 삭제.
        System.out.println(map);

        boolean searchSuccessFlag = map.containsKey(searchId); // 방금 위에서 삭제했으니 'false'
        System.out.println(searchSuccessFlag);

        searchSuccessFlag = map.containsValue("김준이");
        System.out.println(searchSuccessFlag);


        // Map.get(key) 를 하면 value 값을 들고 오는데, 'entry' 는 'key' 와 'value' 로 묶여 있음. ('key' 와 'value' 가 묶여있는 객체)
        // Map.Entry => Map. 은 경로임 intelliJ 라서 이렇게 표기되는거임.
        Set<Map.Entry<String, String>> entry = map.entrySet(); // 'Set' 으로 들고 오는데 안의 값이 'entry' 임

        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>();

        entries.addAll(entry);

        System.out.println("entry 리스트: " + entries);

        Iterator<Map.Entry<String, String>> iterator = entry.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> e = iterator.next(); // e 가 여기서 entry 객체인데, entry 객체는 'getKey' 와 'getValue' 메소드를 사용할 수 있음.
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        // 'keySet()' , 'valueSet()'
        Set<String> keySet = map.keySet();

        System.out.println("keySet >>>> " + keySet); // 'key' 값들만 'Set' 으로 다 들고 올 수 있는 메소드.

        Collection<String> values = map.values(); // 'value' 값만 다 들고 올 수 있음.

        System.out.println("values >>>> " + values);






    }
}
