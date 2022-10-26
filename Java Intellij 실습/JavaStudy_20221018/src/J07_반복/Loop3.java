package J07_반복;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = 0;

        System.out.print("몇번 반복할지 입력하세요 : ");
        n = sc.nextInt();

        for(int i = 0; i <n; i++){
            System.out.println("i : "+(i+1));
        }
        System.out.println("=========");
        for(int i = 0; i<n; i++){
            System.out.println("i : "+(n-i));
        }
    }
}
