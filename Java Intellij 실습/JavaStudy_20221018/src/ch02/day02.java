package ch02;

public class day02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println("T * T = " + result1);
        // true && true => true
        boolean result2 = flag1 && flag2;
        System.out.println("T * F = " + result2);
        // true && false => false
        boolean result3 = flag2 && flag2;
        System.out.println("F * F = " + result3);
        // false && fasle => fasle
        System.out.println("==========");
        boolean result4 = flag1 || flag1;
        System.out.println("T * T = " + result4);
        // true || true => true
        boolean result5 = flag1 || flag2;
        System.out.println("T * F = " + result5);
        // true || fasle => true
        boolean result6 = flag2 || flag2;
        System.out.println("F * F = " + result6);
        // false || fasle => false
        System.out.println("==========");
        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F * T = " + result7);
        // true || false && true => true
        boolean result8 = 10 % 3 != 0;
        System.out.println("T * T = " + result8);
        // 10에서 3으로 나누 값이 0이 아니다 => true



    }
}
