package 정리;

public class 형변환 {
    public static void main(String[] args) {
        char cast1 = 'a';

        /*
         upcasting(업 캐스팅)
         문자 -> 정수 -> 실수
         : 값이 작은 범위에서 큰 범위로의 형 변환
         : 목시적 형변환(형변환 생략 가능)
         */

        int cast2 = cast1;
        System.out.println(cast2);

        /*
        downcasting(다운 캐스팅)
        실수 -> 정수 -> 문자
        : 값이 큰 범위에서 작은 범위로 형변환
        : 명시적 형변환(생략 x)
         */
        double cast3 = cast2;
        int cast4 =(int)cast3;

        // String -> Int
        String s_num = "10";
        int i_num = Integer.parseInt(s_num); // 1번째 방법 , 10진수의 Integer 형으로 반환

        int i_num2 = Integer.valueOf(s_num); // 2번째 방법, 문자형의 num을 int형으로 반환
        // 반대로 int형을 String형 으로 반환 가능

        double d_num = Double.valueOf(s_num); // String -> Double
        float f_num = Float.valueOf(s_num); // String -> float

        // int -> String
        int i_num1 = 10;
        String s_num1 = String.valueOf(i_num1); // int -> String : valueOf
        String s_num2 = Integer.toString(i_num2); // int -> String : Integer.toString








    }
}
