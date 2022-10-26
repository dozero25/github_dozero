package ch02;

import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String address;
        String phone;

        System.out.print("이름을 입력해주세요 : ");
        name = sc.next();

        System.out.print("나이 : ");
        age = sc.nextInt();

        sc.nextLine();
        System.out.print("주소을 입력해주세요 : ");
        address = sc.nextLine();

        System.out.print("전화번호을 입력해주세요 : ");
        phone = sc.nextLine();

        System.out.println("==== 개인정보 ====");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("전화번호 : " + phone);


    }
}
