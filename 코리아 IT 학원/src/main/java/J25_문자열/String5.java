package J25_문자열;

import java.util.*;
public class String5 {
    public static void main(String[] args) {

        String httpMethod = "Get";

        if(httpMethod.equalsIgnoreCase("get")){ // equals는 대소문자 구분을 하며, toLowerCase는 소문자도 허용하게 된다.
            // equalsIgnoreCase : 영문자를 대소문자 없이 구분해라
            System.out.println("get 요청입니다.");
        }else{
            System.out.println("get 요청이 아닙니다.");
        }
    }
}
