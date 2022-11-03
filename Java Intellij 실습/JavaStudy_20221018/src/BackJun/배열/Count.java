package BackJun.배열;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int [] array = new int[a]; // 배열에 들어갈 a 값 입력
        int count = 0; // 원하는 숫자 몇개인지 count

        for(int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }

        int b = scanner.nextInt(); // 찾고자 하는 숫자

        for(int i = 0; i < array.length; i++){
            if(b == array[i]){
                count++;
            }
        }
        System.out.println(count);






    }



}
