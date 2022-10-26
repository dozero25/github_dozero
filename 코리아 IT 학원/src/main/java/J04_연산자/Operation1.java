package J04_연산자;

public class Operation1 {
    public static void main(String[] args) {
        // 증감연산자

        int num1 = 10;
//      num1 = num1 +1;
        num1++;
        System.out.println(num1);
        System.out.println(++num1); // ++ 1증가 시킨다.
        System.out.println(num1);
        // 선증가와 후증가
        // 선증가 : +1이 앞에 붙는다. 바로 증가된다.
        // 후증가 : +1이 뒤에 붙는다. 지금 현재는 num1만 사용하고 그 다음번째 호출될 때 증가시키겠다.


        int num2 = 10;
//      num2 = num2 -1;
        num2--;
        System.out.println(num2);
        System.out.println(--num2);
        System.out.println(num2);


    }
}
