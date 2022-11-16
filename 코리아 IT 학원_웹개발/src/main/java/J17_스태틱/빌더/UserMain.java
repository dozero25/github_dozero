package J17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .email("ehdud05264@naver.com")
                .username("ehdud")
                .build();
        System.out.println(user);

        User2 user2 = User2.builder()
                .name("윤도영")
                .build();

        System.out.println(user2);

       User u = user2.to();
        System.out.println(u);
    }


}
