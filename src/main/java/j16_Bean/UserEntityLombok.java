package j16_Bean;

/*
 * 정보를 담는 객체를 'Entity Class' 라고 한다.
 * [ 'Entity Class' 의 기본 세팅 ]
 * 1. 맴버변수
 * 2. 생성자 정의
 * 3. Getters and Setters 정의
 * 4. Equals and HashCode 정의
 * 5. toString 정의
 * => lombok 사용. -> Entity 정보를 alt + insert 해서 직접 타이핑 할 필요 없음.
 *      (변수나 자료형을 바꿨을 때 하나하나 바꿀 필요 없음.)
 */

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class UserEntityLombok {

    private String username;
    private String password;
    private String email;
    private String name;


}
