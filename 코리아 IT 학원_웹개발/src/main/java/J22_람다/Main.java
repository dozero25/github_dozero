package J22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
         
        // Runnable : retrun이 없으므로 {}을 열어야한다.
        // thread에서 많이 사용된다.
        Runnable runnable = () -> {
            System.out.println("첫번째 프로그램을 실행합니다.");  
        };
        Runnable runnable2 = () -> {
            System.out.println("두번째 프로그램을 실행합니다.");
        };

        runnable.run();
        runnable2.run();

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i <20 ; i++){
                try {
                    Thread.sleep(20); // alt + ender
                    System.out.println("쓰레드1 : "+ i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }); // runnable 람다로 구현
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i <20 ; i++){
                try {
                    Thread.sleep(20);
                    System.out.println("쓰레드2 : "+ i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }// runnable 람다로 구현
        });
        // 순서에 상관없이 동시에 같이 돈다.
//        thread1.start();
//        thread2.start();

        // Supplier
        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());
        // Consumer
        Consumer<String> consumer = name -> { // 매개변수가 하나일때 () 생략 가능
            System.out.println("이름 : "+ name);
        };
        consumer.accept("윤도영");
        // Function
        Function<Integer, String> function = age -> "나이 : "+ age;
        System.out.println(function.apply(25));
        // Predicate
        Predicate<Integer> leapMonth = year -> year % 4 == 0 && year % 100 == 0 || year % 400 == 0;
        System.out.println(leapMonth.test(2000));

    }
}
