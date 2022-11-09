package J19_컬렉션;

import java.util.*;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // 문자열들을 넣을 수 있는 list
        printCollection(list);
       // 값 추가
        System.out.println("값 추가");
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4"); // 자동으로 계속 공간이 늘어난다.
        printCollection(list);

        list.add(1,"문자열5");
        printCollection(list);
        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        addAllList.addAll(2, list);
        printCollection(addAllList);

        System.out.println("-----------------------");
        // 값 조회
        System.out.println("값 조회");
        String str1 = list.get(0);
        System.out.println("str1 : "+str1);
        
        // 반복을 사용한 값 조회
        for(int i = 0; i < list.size(); i++){
            System.out.println("일반 for - str : " + list.get(i));
        }
        // forEach : 배열 map switch 다 가능
        for(String str : list){ // 처음부터 끝까지 전부 반복
            System.out.println("forEach - str : "+ str);
        }
        // Iterator 사용한 반복 조회
        Iterator<String> iterator = list.iterator(); // Iterator의 구조는 forEach하고 구조가 유사하다.
        System.out.println("iterator 첫 생성시 : " + iterator.next());
        while(iterator.hasNext()){ // hasNext : 다음 배열에 값이 있는지 확인.
            System.out.println("iterator - str : "+iterator.next()); // next : 다음 값을 꺼낸다.
            // 마지막으론 Iterator 배열은 텅 빈 공간이 된다.
        }
//        System.out.println(iterator.next()); -> 꺼낼 다음 next가 없어서 오류가 뜨게 된다.
        // 항상 hasNext와 함께 사용해야한다.

        System.out.println("-----------------------");
        //값 수정
        System.out.println("값 수정");
        list.set(1, "문자열6");
        printCollection(list);

        // 값 삭제
        System.out.println("값 삭제");
        list.remove(0);
        printCollection(list);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals("문자열3")){
                list.remove(i);
                break;
            }
        }
        list.add("문자열2");
        printCollection(list);

        System.out.println("-----------------------");
        //값의 위치찾기
        System.out.println("값의 위치 찾기");
        System.out.println();
        int index = list.indexOf("문자열2");
        System.out.println("문자열2의 위치 : "+index);

        // 뒤에서부터 찾고 싶다.
        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열 2의 위치 : " + lastIndex);

        System.out.println("-----------------------");
        // 값을 포함하고 있는지 여부 조회
        System.out.println("값을 포함하고 있는지 여부 조회");
        System.out.println();
        boolean isTrue = list.contains("문자열2");
        System.out.println("list에 문자열2가 포함되어 있는가? "+ isTrue);
        boolean isFalse = list.contains("문자열5");
        System.out.println("list에 문자열5 포함되어 있는가? "+ isFalse);

        System.out.println("-----------------------");
        // 리스트를 배열로 변환
        System.out.println("리스트를 배열로 변환");
        Object[] objects = list.toArray(); // object로 retrun 해줘야한다.
        System.out.println();
        System.out.println(objects[0]);
        for(Object object : objects){
            System.out.println(object);
        }


    }
    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }
}
