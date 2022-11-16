package J25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {
    public static void main(String[] args) {

        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(","); // split을 가지고 배열을 만는다.

        List<String> roleList = Arrays.asList(roleArray);
        List<String> validRoleList = new ArrayList<String>();
        List<String> validRoleList2 = new ArrayList<String>();

        // role : 앞에 붙는 것을 프리픽스, 뒤에 붙는 것을 서브픽스
        roleList.forEach(role -> {
           if( role.startsWith("ROLE")){
               validRoleList.add(role);
           }
        });

        System.out.println(validRoleList);

        roleList.forEach(role -> {
            if(role.endsWith("MANAGER") || role.endsWith("ADMIN")){
                validRoleList2.add(role);
            }
        });

        System.out.println(validRoleList2);




    }
}
