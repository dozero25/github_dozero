package J05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        문자열로 입력
        next()      -> 띄어쓰기 포함 x
        nextLine()  -> 띄어쓰기 포함 o

         */
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        System.out.println("입력 받은 값1 : "+s);
        System.out.println("입력 받은 값2 : "+s2);
        System.out.println("입력 받은 값3 : "+s3);
        String name;
        int age;
        System.out.print("이름을 입력해주세요 : ");
        name = sc.next();
        System.out.print("나이를 입력해주세요 : ");
        age = sc.nextInt();







    }
}
