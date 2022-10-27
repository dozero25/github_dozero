package BackJun;

import java.util.Scanner;

public class DiceThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int reward = 0;

        System.out.print("숫자 세개를 입력하세요 : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if(num1 == num2 ){
            if(num1 == num3){
                reward = 10000+num1*1000;
                System.out.println(num1+", "+num2+", "+num3+" 보상 : "+reward+"원");
            }else if(num1 != num3){
                reward = 1000+num1*100;
                System.out.println(num1+", "+num2+", "+num3+" 보상 : "+reward+"원");
            }
        }
        else {
            if (num1 == num3) {
                reward = 1000 + num1 * 100;
                System.out.println(num1 + ", " + num2 + ", " + num3 + " 보상 : " + reward + "원");
            }
            else {
                if(num1 > num2 && num1 > num3){
                    reward = num1 * 100;
                    System.out.println(num1 + ", " + num2 + ", " + num3 + " 보상 : " + reward + "원");
                } else if (num2 > num3 && num2 > num1) {
                    reward = num1 * 100;
                    System.out.println(num1 + ", " + num2 + ", " + num3 + " 보상 : " + reward + "원");
                } else if (num3 > num1 && num3 > num2){
                    reward = num1 * 100;
                    System.out.println(num1 + ", " + num2 + ", " + num3 + " 보상 : " + reward + "원");
                }
            }
        }

    }
}
