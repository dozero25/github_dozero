package 정리.스태틱.빌더;

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

        public UserBuilder username(String username){
            this.username = username;
            return this;}
        public UserBuilder password(String password){
            this.username = password;
            return this;}
        public UserBuilder email(String email){
            this.username = email;
            return this;}
        public UserBuilder name(String name){
            this.username = name;
            return this;}

        public User build(){
            return new User(username, password, email, name);}
        }
    public static UserBuilder builder(){ // User라는 클래스에서 builder 를 받는다
        return new UserBuilder(); // new UserBuilder를 반환한다.
    }


}
