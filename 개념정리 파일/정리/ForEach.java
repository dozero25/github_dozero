package 정리;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("윤도영");
        list.add("윤도일");
        list.add("윤도이");
        list.add("윤도삼");
        list.add("윤도사");
        list.add("윤도오");

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println();

        list.forEach(name -> {
            System.out.println(name);
        });

        System.out.println();

        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i < 100; i++) {
            numbers.add(i+1);
        }

        AtomicInteger result = new AtomicInteger();

        numbers.forEach(num -> {
           result.addAndGet(num);
        });

        System.out.println(result.get());

        System.out.println();

        Map<Integer, String> students = new TreeMap<Integer, String>();
        for(int i = 0; i < 10; i++) {
            students.put(20220001 + i, "윤도"+(i+1));
        }

        students.forEach((key, value)-> {
            System.out.println("학번 : "+key + ", 이름 : "+ value);
        });

    }
}
