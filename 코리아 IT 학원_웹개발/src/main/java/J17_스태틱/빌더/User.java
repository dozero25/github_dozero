package J17_스태틱.빌더;
import lombok.AllArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@ToString
public class User {
    private String username;
    private String password;
    private String email;
    private String name;

    public static class UserBuilder{
        private String username;
        private String password;
        private String email;
        private String name;

        public UserBuilder username(String username) {
            this.username = username;
            return this;}
        public UserBuilder password(String password) {
            this.password = password;
            return this;}
        public UserBuilder email(String email) {
            this.email = email;
            return this;}
        public UserBuilder name(String name) {
            this.name = name;
            return this;}
        public User build(){
            return new User(username, password, email, name);}
    }
   public static UserBuilder builder(){ // User라는 클래스에서 builder를 받는다.
       return new UserBuilder(); // 이 new UserBuilder를 반환한다.
   }

}

