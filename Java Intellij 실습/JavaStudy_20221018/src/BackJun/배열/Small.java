package BackJun.배열;

import java.util.Scanner;

public class Small {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();
        int [] array = new int[max];
        int small = scanner.nextInt();

        for (int i = 0; i < max; i++) {
            array[i] = scanner.nextInt(); // 배열에 값 입력
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] < small) { // i가 small 값 보다 작으면
                System.out.print(array[i] + " ");
            }
        }




    }
}
