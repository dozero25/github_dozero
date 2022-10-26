package ch01;

public class Test2 {
    public static void main(String[] args) {
        // upcasting(업캐스팅)
        int a = 10;
        double b = (int)a;
        System.out.println(b);

        float c =(int)a;
        System.out.println(c);

        // downcasting(다운캐스팅)
        int d = 100;
        char d1 = (char)d; //명시적형변환
        System.out.println(d1);

        double e = 10.35;
        int e1 = (int)e;
        System.out.println(e1);

        int num1 = 10;
        // 선증가 : 바로 증가
        // 후증가 : 그 다음 코드부터 증가
        System.out.println(num1++);
        System.out.println(++num1);
        // - 도 동일
        System.out.println(num1--);
        System.out.println(--num1);
    }
}
