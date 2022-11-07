package j17_스태틱.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User2 { // User2 에 들어가 있는 값들이 -> User2에 들어가 있는 to 메소드를 통해서 User 객체를 생성; -> 생성할 때 User2의 변수 값들이 옯겨짐.
    private String username;
    private String password;
    private String email;
    private String name;

    public User to() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }

}
