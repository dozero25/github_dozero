package BackJun;

import java.util.Scanner;

public class compare01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=0;
        int b =0;

        System.out.print("숫자 a를 입력하세요 : ");
        a = sc.nextInt();
        System.out.print("숫자 b를 입력하세요 : ");
        b = sc.nextInt();

        if(-10000 >= a || a >= 10000 && b <= -10000 || b>=10000){
            System.out.println("범위 밖의 숫자입니다.");
        }else{
            if(a > b){
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else if (a == b) {
                System.out.println("==");
            }
        }

    }
}
