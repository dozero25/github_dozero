package BackJun.문자열;

import java.util.Scanner;

public class NumSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int [] array = new int[num];
        int sum = 0;

        for(int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println(sum);






    }
}
