package 정리.컬렉션;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {

        Map<String, String> studentMap = new HashMap<String, String>();

        studentMap.put("username", "도제로");
        studentMap.put("password", "1234");
        studentMap.put("email", "ehdud05264@naver.com");
        studentMap.put("name", "윤도영");

        Set<String> keySet = studentMap.keySet(); // map -> set
        List<String> keyList = new ArrayList<String>(); // set -> list
        keyList.addAll(keySet); // list에 keySet 값을 모두 가져옴




    }
}
