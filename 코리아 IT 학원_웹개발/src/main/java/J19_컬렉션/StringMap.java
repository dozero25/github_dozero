package J19_컬렉션;

import java.util.*;

public class StringMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();
        System.out.print("List : ");
        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);
        System.out.println(list.get(3));
        System.out.print("Map : ");
        // Set과 동일하다. key 값을 기준으로 정렬을 한다.(Hash값)
        map.put("kor2022000-j", "김준일");
        map.put("kor2022000-l", "이동빈");
        map.put("kor2022000-d", "도정민");
        map.put("kor2022000-c", "해혁일");
        map.put("kor2022000-j2", "김준일");

        System.out.println(map);

        System.out.println(map.get("kor2022000-d"));// key값으로 검색이 가능, 보통 String key값으로 사용한다.

        System.out.println();

        /*
            kor2022000-c 학번의 학생의 이름을 김완준으로 바꿔주세요.
        */
        // key가 set의 특징을 가진다.
        String searchId = "kor2022000-c";
        // Put을 활용한 값 변경
        System.out.print("Put을 활용한 값 변경 : ");
        map.put("kor2022000-c", "김완준"); // put : 값을 집어 넣는다.
        System.out.println(map);
        // 값 수정
        System.out.print("값 수정 : ");
        map.replace(searchId, "이성욱"); // replace : 값을 수정한다. list, set 동일
        System.out.println(map);
        // 값 삭제
        System.out.print("값 삭제 : ");
        map.remove(searchId); // remove : 삭제
        System.out.println(map);

        // 값이 있는지 없는지 확인
        boolean searchSuccessflag = map.containsKey("kor2022000-j2");
        System.out.println(searchSuccessflag);
        searchSuccessflag = map.containsValue("김준이");
        System.out.println(searchSuccessflag);

        System.out.println();

        // entrySet : key 값 value 값 모두 출력
        Set<Map.Entry<String, String>> entry = map.entrySet(); // set인데 entry 객체를 집어 넣는다.
        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>();
        // list인데 entry객체를 집어 넣는다.

        entries.addAll(entry);
        System.out.println("entry리스트 : "+ entries);
        System.out.println();

        Iterator<Map.Entry<String, String>> iterator = entry.iterator(); // set이 entry를 가지고 있는 걸로 iterator로 변환
        while(iterator.hasNext()){
            // 패키지 경로 Map.Entry
            Map.Entry<String, String> e = iterator.next(); // 반복을 통해 next를 꺼낸다.
            System.out.println(e.getKey()); // key값을 가지고 온다.
            System.out.println(e.getValue()); //value값을 가지고 온다.
        }
        
        // key 값만 가져오기
        Set<String> keySet = map.keySet();
        System.out.println("keySet >>>> " + keySet);
        // value 값만 가져오기
        Collection<String> values = map.values();
        System.out.println("value >>>> "+ values);



    }
}
