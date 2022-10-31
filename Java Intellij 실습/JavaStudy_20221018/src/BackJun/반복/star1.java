package BackJun.반복;

import java.util.Scanner;

public class star1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;

        System.out.print("반복할 별의 갯수르 입력하세요 : ");
        a = scanner.nextInt();
        for(int i = 0; i < a; i++){

            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
