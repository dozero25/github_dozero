package BackJun;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        // 입력 값이 어떤 사분면에 속하는지 알아내는 것
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.print("첫번째 숫자를 입력해주세요 : ");
        num1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        num2 = scanner.nextInt();

        if(num1 >0 && num2 > 0){
            System.out.println("("+num1+", "+ num2+")"+", 1분면에 속합니다.");
        } else if (num1 < 0 && num2 > 0) {
            System.out.println("("+num1+", "+ num2+")"+", 2분면에 속합니다.");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("("+num1+", "+ num2+")"+", 3분면에 속합니다.");
        } else if (num1 > 0 && num2 < 0) {
            System.out.println("("+num1+", "+ num2+")"+", 4분면에 속합니다.");
        }


    }
}
