package day17;

import java.util.*;

public class Method3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("밑변의 길이를 입력해주세요 : ");
		a=sc.nextInt();
		System.out.println("높이의 길이를 입력해주세요 : ");
		b=sc.nextInt();
		
		System.out.println("사격형의 넓이 : "+ calculator(a, b));

	}
	static int calculator(int a, int b) { // a b int로 지정
		System.out.println("<계산을 시작합니다.>");
		int area=a*b;
		return area;
	}

}
