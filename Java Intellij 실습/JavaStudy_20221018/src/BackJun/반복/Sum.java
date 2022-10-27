package BackJun.반복;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= num1; i++){
            if(num1 > 10000 || num1 < 0){
                System.out.println("입력 오류");
                break;
            }else{
                sum +=i;
            }
        }
        System.out.println(sum);

    }
}
