package day08;

import java.util.Scanner;

public class Switch_Traffic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("★☆★☆★☆신호등 프로그램입니다★☆★☆★☆");
		System.out.println("빨간불 : 1, 노란불 : 2, 초록불 : 3");
		System.out.print("신호입력 : ");
		int sign = sc.nextInt(); //
		switch(sign) {// sign이 1인가 2인가 3인가 case를 선택
		case 1: 
			System.out.println("빨간불입니다. 정지하세요");
			break;
		case 2:
			System.out.println("노란불입니다. 서행하세요");
			break;
		case 3:
			System.out.println("초록불입니다. 출발하세요");
			break;
		default: //마지막은 default:로 마무리
			System.out.println("잘못입력하셨습니다.");
		
		
		}

	

	}

}
