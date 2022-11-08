package J19_컬렉션;

import java.util.*;

public class StringSet {
    public static void main(String[] args) {

        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일");

        // 값 추가
        strSet.add("김준일");
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        System.out.println(strSet); // hash의 정렬방법으로 들어간다.
        strSet.addAll(strList); // strList 전부 넣기
        System.out.println(strSet); // Set은 중복을 제거할때 사용한다.


        // 값 조회
        String searchName = "김준일"; // get으로 값을 조회할 수 없다.
        /*
        strSet에 김준일이 있으면 true 없으면 false
         */
        // set은 무조건 반복을 통해서 해야한다.
        boolean isTrue = false; // flag를 하나 준다.

        for(String name : strSet){
            if(name.equals(searchName)){
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);

        System.out.println("-----------------------");
        // 값 수정
        /*
            송아셀 -> 남강석으로 바꿔라
        */
        searchName = "송아셀";

        for(String name : strSet){
            if(name.equals(searchName)){
                strSet.remove(searchName);
                strSet.add("남강석");
                break;
            }
        }
        // set이 없기때문에 지우고 추가를 해줘야한다.
        System.out.println(strSet);
        System.out.println("-----------------------");

        searchName = "김준일";
        // 위에 내용을 한번에 처리하는 방법
        System.out.println(strSet.contains(searchName)); // 포함하고 있나
        if(strSet.contains(searchName)){
            strSet.remove(searchName);
            strSet.add("김준이");
        }
        System.out.println(strSet);





    }
}
