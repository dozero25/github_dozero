package BackJun.배열;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = new int[10];
        boolean bl;
        int count = 0;

        System.out.print("나눌 숫자 입력 : ");
        int divide = scanner.nextInt();

        System.out.println("숫자 입력");
        for(int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt()%divide; // 입련된 값을 나눈 나머지를 배열로 보냄
        }
        for(int i =0; i < array.length; i++) {
            bl = false;
            for(int j =i+1; j < array.length; j++) {
                if(array[i] == array[j]) { // i와 j가 같으면 true로 braek
                    bl = true;
                    break; // count를 하기 않게 된다.
                }
            }
            if(bl == false){ // false일때 count
                count++;
            }
        }
        System.out.println(count);





    }
}
