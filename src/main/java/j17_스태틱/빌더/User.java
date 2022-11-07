package j17_스태틱.빌더;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor // 매개변수 자리에 값을 하나하나 순서대로 넣어줘야하고, 자료형에, null일 경우 표기 해줘야하는데, 빌더 패턴은 그럴 필요 없음.
@ToString
public class User { // 'User' 의 멤버변수
    private String username;
    private String password;
    private String email;
    private String name;

//    private User(UserBuilder userBuilder) { // 'UserBuilder' 가 먼저 생성이 되어야 함.
//        this.username = userBuilder.username;
//        this.password = userBuilder.password;
//        this.email = userBuilder.email;
//        this.name = userBuilder.name;
//    }

    // 스태틱 클래스
    public static class UserBuilder { // 클래스 안에 클래스를 생성했는데, 이 클래스는 'User' 안 에서만 쓸수 있음.
        private String username; // 위의 User 의 변수들이 들어옴.
        private String password;
        private String email;
        private String name;

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(username, password, email, name);
        }

    }

    public static UserBuilder builder() { // 스태틱 메소드. // 1. 'UserBuilder' 를 리턴. // 2. User.builder(); 호출하면 UserBuilder를 리턴
        return new UserBuilder();
    }

//    public User(String username) {
//        this.username = username;
//    }

//    public User(String email) { // 메소드 클래스 명이 똑같음 // 이러면 'NoArgsConstructor' 로 하나하나 만들어야 함.
//        this.email = email;
//    }
}
