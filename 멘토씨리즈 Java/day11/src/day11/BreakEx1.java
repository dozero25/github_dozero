package day11;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		while(true) {
			System.out.println("숫자입력 : ");
			i=sc.nextInt();
			if(i==0) {
				System.out.println("반복을 멈춥니다.");
				break;
			}
			System.out.println("i : "+i);
		}
	}

}
