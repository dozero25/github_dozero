package BackJun.배열;

import java.util.Scanner;

public class MaxLeast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int max = 0; // 최대값을 받는 변수
        int least = 0; // 최소값을 받는 변수

        int [] array = new int[a];

        for(int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) { // array가 max 보다 크면
                max = array[i]; // array를 max에 담는다.
            }else{
                least = array[i]; // 아닐 경우 least에 담는다.
            }
        }

        System.out.println(max +", "+least);



    }
}
