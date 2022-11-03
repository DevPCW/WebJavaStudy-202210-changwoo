package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


//@NoArgsConstructor => 같이 쓸 수 없음.
@RequiredArgsConstructor // final을 가지고 있는 변수에 대한 생성자
@AllArgsConstructor
public class PersonRequired {

    private final String name;
    private int age;


}
