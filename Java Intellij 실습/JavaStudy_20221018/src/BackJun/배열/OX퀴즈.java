package BackJun.배열;

import java.util.Scanner;

public class OX퀴즈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String[] array = new String[a+1];
        int count =0, sum = 0;

        for (int i = 0; i < a; i++) {
            array[i] = scanner.next();
            for (int j = 0; j < array[i].length(); j++) {
                if(array[i].charAt(j) == 'O'){ // O 이면 count하고 sum에 더함
                   count++;
                   sum += count;}
                else count = 0; // 아닐경우 count는 0
                }
            System.out.println(sum);


            }


            }

        }






