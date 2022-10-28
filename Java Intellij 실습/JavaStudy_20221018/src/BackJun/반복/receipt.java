package J07_반복;

import java.util.Scanner;

public class receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = 0;
        int num = 0;
        int a = 0;
        int b = 0;
        int c= 0;

        System.out.print("가격을 입력해주세요 : ");
        price = scanner.nextInt();
        System.out.print("구매한 물건의 종류 수를 입력해주세요 : ");
        num = scanner.nextInt();
        for(int i = 0; i <=num; i++) {
            for (int j = 0; j <num; j++) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                c += a*b;
            }
             if(price == c){
                 System.out.println("구매한 가격 : "+c);
                 System.out.println("Yes");
             }
             else {
                 System.out.println("구매한 가격 : "+c);
                 System.out.println("No");
             }

        }






    }
}
