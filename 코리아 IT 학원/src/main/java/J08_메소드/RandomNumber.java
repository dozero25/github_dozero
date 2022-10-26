package J08_메소드;

import java.util.Random;

public class RandomNumber {
                                // 변수명
    public static int calcRandom(int m) {
        Random random = new Random();

        int result = random.nextInt(10)*1000 + m;

        return result; //리턴자료형, 반환자료형 앞에 int, String 등 그 값만 retrun하게 된다.
    }
    // 함수 : 복잡한 로직을 반복적으로 사용하지 않고 간단하게 사용하기 위해
    public static void main(String[] args) {
        int money =  5000;

        System.out.println(calcRandom(money)); // 위의 모든 공식을 한줄로 처리, retrun 값을 가지게 된다.
        System.out.println(calcRandom(money)); // 기능 또는 함수 정리 = 메소드
        System.out.println(calcRandom(money));

        int r = calcRandom(money);
        System.out.println(r+100);
        System.out.println(r+1000);
        System.out.println(r+10000);
        System.out.println(r+100000);



    }
}
//        Random random = new Random();


/*int a = random.nextInt(10)*1000 + money;
        System.out.println(a);
        int b = random.nextInt(10)*1000 + money;
        System.out.println(b);
        int c = random.nextInt(10)*1000 + money;
        System.out.println(c);
        int d = random.nextInt(10)*1000 + money;
        System.out.println(d);*/

       /* for (int i = 0; i <10; i++) {
            int randNum = random.nextInt(100)+100; // 숫자만 입력
            System.out.println(randNum);
        }*/
//        System.out.println(a+b+c+d);