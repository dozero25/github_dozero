package J24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        for(String name : list){
            System.out.println(name);
        }
        
        System.out.println();
        
        list.forEach(name -> {
            System.out.println(name);
        });
        
        System.out.println();
        
        // 아래 로직을 한번에 적은 것이 위에 list.forEach이다
        Consumer<String> consumer = name -> {
            // 람다 식을 쓸 수 있는 조건 :  추상 메소드(구현 x)가 하나여야 한다.
            System.out.println(name);
        };
        for(String name : Objects.requireNonNull(list)) {
            consumer.accept(name);
        }

//      익명 클래스
//        Consumer<String> c  ==> name 으로 변환
//        = new Consumer<String>(){
//            @Override
//            public void accept    ==>  -> 람다식으로 변환
//            
//            (String s) {
//                System.out.println(name); ==> 구현부로 변환
//            }
//        };
//        Consumer 부분, 이렇게 작성하는 것이 번거로워서 람다식으로 줄였다.
//
//        위에 식을 아래 식으로 간단하게 할 수 있다.
//        list.forEach(name -> {
//            System.out.println(name);
//        });

        System.out.println();

        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i < 100; i++){
            numbers.add(i+1);
        }

        AtomicInteger result = new AtomicInteger(); // 람다 때 사용함, AtomicInteger

        numbers.forEach(num -> {
            result.addAndGet(num); // 가지고 와서 더해라, += 동일
        });

        System.out.println(result.get());

        System.out.println();

        Map<Integer, String> students = new TreeMap<Integer, String>(); // 정렬을 할 수 있다. integer가 key 값인 경우
        for(int i = 0; i < 10; i++){
            students.put(20220001 + i, "김준"+(i+1));
        }

        students.forEach((key, value)->{
            System.out.println("학번 : "+ key + ", 이름 : "+value);
        });
    }
}
