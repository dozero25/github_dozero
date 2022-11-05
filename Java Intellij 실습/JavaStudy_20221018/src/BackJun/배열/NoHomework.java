package BackJun.배열;

import java.util.Scanner;

public class NoHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[31];
        int student = 0;
        for (int i = 1; i < 29; i++) { // 1~28까지 배열
            int submit = scanner.nextInt(); // int submit으로 하여 제출한 학생 분류
            array[submit] = 1; // 제출한 학생들을 1로 지정
        }
        for(int i = 1; i < array.length; i++) {
            if(array[i] != 1) { // array이 1이 아닐 경우
                System.out.println(i);
            }
        }


    }




}
