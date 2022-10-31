package BackJun.반복;

import java.util.Scanner;

public class Scanner_ab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        System.out.print("반복할 숫자의 갯수를 입력하세요 : ");
        d = scanner.nextInt();
        for(int i = 0; i <d; i++) {
            System.out.print("a : ");
            a = scanner.nextInt();

            System.out.print("b : ");
            b = scanner.nextInt();

            c = a+b;

            System.out.println("a + b = "+c);
        }
    }
}
