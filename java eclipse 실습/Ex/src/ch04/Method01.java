package ch04;

import java.util.Scanner;

public class Method01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.print("밑변의 길이를 입력해주세요 : ");
		a = sc.nextInt();
		System.out.print("높이의 길이를 입력해주세요 : ");
		b = sc.nextInt();
		
		System.out.println("사각형의 넓이 : "+calculator(a,b));
	}
	static int calculator(int a, int b) {
		System.out.println("<계산을 시작합니다.>");
		int area=a*b;
		return area;
	}

}
