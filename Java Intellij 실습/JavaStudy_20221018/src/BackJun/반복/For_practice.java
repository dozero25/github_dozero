package BackJun.반복;

import java.util.Scanner;

public class For_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        for(int i = 0; i < 7; i++){
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            sum = num1 + num2;
            System.out.println(sum);
        }

    }
}
