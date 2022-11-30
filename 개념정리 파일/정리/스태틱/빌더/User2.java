package 정리.스태틱.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User2 {

    private String username;
    private String password;
    private String email;
    private String name;

    public User to() { // User2 클래스가 User 클래스로 변하게 된다.
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
