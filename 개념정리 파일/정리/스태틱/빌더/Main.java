package 정리.스태틱.빌더;

public class Main {

    /*
        빌더
        : 많은 멤버변수나 지속성 없는 상태값들에 대해 처리해야하는 문제들을 해결한다.
        : builder를 통해 해결
        : lombok이 있으면 더욱 쉽게 해결이 가능하다.
     */

    public static void main(String[] args) {
        User user = User.builder()
                .email("ehdud05264@naver.com")
                .username("ehdud")
                .build();

        System.out.println(user);

        User2 user2 = User2.builder()
                .name("윤도영")
                .email("ehdud05264@naver.com")
                .password("1234")
                .build();

        System.out.println(user2);

        User u = user2.to();
        System.out.println(u);
    }
}
