package ch01;

public class Test {
    public static void main(String[] args) {

        // 논리형자료형 변수
        boolean blueFlag = true;
        System.out.println(blueFlag);
        
        boolean whiteFlag = false;
        System.out.println(whiteFlag);
        
        // 문자자료형 변수
        char n1 = '윤';
        char n2 = '도';
        char n3 = '영';
        System.out.println(""+n1 + n2+n3);
        
        //문자열자료형 변수
        String s1 = "Hello~";
        String s2 = " Java~";
        String s3 = s1 +s2;
        System.out.println(s3);

        int a = 10;
        int b = 20;
        System.out.println(a+b);

        long time = System.currentTimeMillis();
        System.out.println(time);

        double pi = 1.255318256553;
        System.out.println(pi);

        final String myName = "윤도영";
        System.out.println(myName);

    }
}
