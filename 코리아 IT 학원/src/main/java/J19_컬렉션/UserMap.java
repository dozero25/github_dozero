package J19_컬렉션;

import java.util.*;

public class UserMap {
    public static void main(String[] args) {

        Map<String, String> userMap = new HashMap<String, String>();

        userMap.put("username", "junil");
        userMap.put("password", "1234");
        userMap.put("email", "skjil1218@gmail.com");
        userMap.put("name", "김준일");

        Set<String> keySet = userMap.keySet(); // map이 가지고 있는 값을 set으로 가져옴
        List<String> keyList = new ArrayList<String>(); // set이 가지고 있는 값을 list로 가져옴
        keyList.addAll(keySet); // list에 keySet값을 모두 가져온다.

        String keyName1 = keyList.get(0); // name에 keyList에서 가져온 값을 넣는다.
        String keyName2 = keyList.get(1);
        String keyName3 = keyList.get(2);
        String keyName4 = keyList.get(3);

        String value1 = userMap.get(keyName1); // value값을 알고 있기 때문에 바로 가져옴
        String value2 = userMap.get(keyName2);
        String value3 = userMap.get(keyName3);
        String value4 = userMap.get(keyName4);

        System.out.println(keyName1 + " >> " + value1);
        System.out.println(keyName2 + " >> " + value2);
        System.out.println(keyName3 + " >> " + value3);
        System.out.println(keyName4 + " >> " + value4);
    }
}
