package J16_Bean;

// entity class : 정보를 담는 객체
/*  순서

    1. 멤버변수 선언
    2. 생성자 정의
    3. Getter and Setters 정의
    4. Equals and HashCode 정의
    5. toString 정의
 */

public class UserEntity {
    // 멤버변수
    private String username;
    private String password;
    private String email;
    private String name;

    //생성자
    public UserEntity() {
        // 기본생성자를 만들어 주고 생성자를 만든다.
    }
    public UserEntity(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }
    // getter and setter
    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    // equals and hashCode
    @Override
    public int hashCode() {return super.hashCode();}
    @Override
    public boolean equals(Object obj) {return super.equals(obj);}
    // toString : Alt + insert
    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
