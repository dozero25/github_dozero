package BackJun.배열;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int maximum = 0; // 최댓값을 받을 변수
        int w = 0; // 최댓값 위치를 받을 변수

        int [] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
                w = array.length-1; // w에 array.length해서 maximum의 위치값을 받음
            }
        }

        System.out.println(maximum);
        System.out.println(w);

    }
}
