package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .email("abcd@gmail.com")
                .username("홍길동")
                .build();
        

        System.out.println(user);


        // User2에서는 lombok으로 import함.
        User2 user2 = User2.builder()
                .name("홍길동1")
                .build();

        System.out.println(user2);

        // 위의 정보가 옯겨짐.
        User u = user2.to();
        System.out.println(u);
    }
}
