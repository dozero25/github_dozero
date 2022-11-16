package J16_Bean;

import lombok.*;

// entity class : 정보를 담는 객체
/*  순서

    1. 멤버변수 선언
    2. 생성자 정의
    3. Getter and Setters 정의
    4. Equals and HashCode 정의
    5. toString 정의
 */
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data // 위에 있는 주석처리된 4가지를 전부 대체 가능하다.
public class UserEntityLombok {
    // 멤버변수
    private String username;
    private String password;
    private String email;
    private String name;


}
