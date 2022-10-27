package BackJun.반복;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int result = 0;
        System.out.print("숫자를 입력하세요 : ");
        num1 = scanner.nextInt();

        for(int i = 1; i <= 9; i++){
            result = num1 * i;
            System.out.println(num1 +" * "+ i + " = "+ result);
        }
    }

}
