package j19_컬렉션;


// 클래스 클래스 - 상속관계
// 클래스 인터페이스 - 구현
// 인터페이스 인터페이스 - 상속관계
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {

    public static void main(String[] args) {
        // 컬렉션 프레임워크 중 List 인터페이스 사용법.
//        ArrayList<String> list = new ArrayList<String>();
//        // 인터페이스는 생성 못하기 때문에, List 인터페이스로 구현된 ArrayList 클래스로 생성을 함.
//
//        // 'List' 는 배열처럼 순서가 있음.
//        list.add("김"); // 0번 공간
//        list.add("준"); // 1번 공간
//        list.add("일"); // 2번 공간
//
//        System.out.println(list.get(1)); // => 1번 공간에 있는 "준"이 출력됨.
//        // get 함수와 매개변수로 순서가 있는 공간을 넣어주면 값을 들고 올 수 있음.

        ArrayList<String> list = new ArrayList<String>();
        printCollection(list); // 처음에는 비어져 있음.



        // 값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");
        printCollection(list); // 순서대로 값이 들어감.

        list.add(1, "문자열5");
        printCollection(list); // 1번 공간에 "문자열5"가 추가됨. (하나씩 공간을 뒤로 떙겨서 수작업 할 필요 없음)

        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list); // 위의 기존에 있는 'list' 를 옯긴거임
        addAllList.addAll(2, list); // 2번 인덱스 부터 또 추가로 위의 'list' 를 추가
        printCollection(addAllList);
        // 이게 가능한 이유가 'List' 가 'Collection' 을 상속받았기 때문임.

        // 값 조회
        String str1 = list.get(0);
        System.out.println("str1: " + str1);

        // 'foreach' 구문: 배열/리스트/셋/맵 다 됨.
        // 'foreach' 는 처음부터 'list' 의 끝까지 전부 반복됨.
        // 일반 'for' 문은 조건식으로 반복횟수를 제어할 수 있음.

        // 반복을 사용한 값 조회

        for(int i = 0; i < list.size(); i++) { // 일반 for 문 사용
            System.out.println("일반 for - str: " + list.get(i));

        }

        for(String str : list) { // foreach 문 사용
            System.out.println("forEach - str: "  + str);
        }

        // iterator 반복자 사용
        // 안에 있는 데이터를 반복자한테 넘겨 줌. => 그걸 'iterator' 변수에 넘겨줌.
        // 'while' 을 돌렸을 떄 hasNext(); 다음이 있나?라는 메소드인데,
        // 다음이 있으니 true 값 => 반복 실행.
        // iterator.next(); 다음 순서 나와라는 메소드.
        // 그 공간은 비고 그 다음 순서 나가고 반복
        // 그러다가 공간이 다 비었을 때 다음이 없으니 'false' 가 됨 반복이 멈춤.
        // 이제 iterator 변수는 텅 비게 됨 반복 후 데이터가 없음.
        // 기존에 갖고 있던 'list' 를 'iterator' 라는 통에 담은 거임.
        // 항상 hasNext()와 같이 쓰도록 유념.
        Iterator<String> iterator = list.iterator();
        System.out.println("iterator 첫 생성시: " + iterator.next());

        while (iterator.hasNext()) {
            System.out.println("iterator - str: " + iterator.next());
        }

        // 꺼낼게 없어서 'NoSuchElementException' 이 발생
//        System.out.println(iterator.next());

        // 값 수정
        // "문자열5"에서 "문자열6"으로 값 수정.('set' 은 컬렉션 프레임워크의 셋이 아니고 'setter' 의 셋임)
        list.set(1, "문자열6");
        printCollection(list);

        // 값 삭제(매개변수에 'index' 를 가지고 삭제함)
        list.remove(0); // 0번 인덱스의 "문자열1"이 삭제됨.
        printCollection(list);

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("문자열3")) {
                list.remove(i); // 하나만 딱 지움.
                break; // 찾았으니 더이상 반복할 필요 없음.
            }
        }

        list.add("문자열2");
        printCollection(list);

        // 값의 위치 찾기 // 순서대로 첫번째 값부터 들고옴

        int index = list.indexOf("문자열3");
        System.out.println("문자열3의 위치: " + index); // 문자열3은 위에서 삭제됨. 찾고자 하는 값이 없으면 -1


        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열2의 위치: " + lastIndex);

        // 값을 포함하고 있는지 여부 조회
        boolean isTrue = list.contains("문자열5");
        System.out.println("list 에 문자열5가 포함되어 있는가? " + isTrue);

        // 리스트를 배열로 변환
        // toArray();의 리턴타입이 'Object' 임
        // 그래서 'Object' 배열로 받아야함.
        // 리스트 안에 어떤 타입의 값이 들어가있는지 모르기 때문에 'Object' 임.
        Object[] objects = list.toArray();
        System.out.println(objects[0]);
        System.out.println("<<---- 구분선 ---->>");
        for(Object object : objects) {
            System.out.println(object);
        }

    }

    public static void printCollection(Collection collection) {
        System.out.println(collection);
        System.out.println();
    }
}
