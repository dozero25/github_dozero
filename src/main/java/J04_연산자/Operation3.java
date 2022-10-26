package J04_연산자;

/*
    윤년은 연도가 4의 배수이면서,
    100의 배수가 아닐 때 또는 400의 배수일 때이다.
 */

import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력해주세요 : ");
        int year = sc.nextInt();
        boolean result = false;

        result = year % 4 == 0 && year % 100 !=0 || year % 400 ==0;

        System.out.println("결과 : "+result);


    }
}
