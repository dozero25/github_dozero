package ch03;

import java.util.Scanner;

public class calc {
	
	//계산기 1.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int n1 = sc.nextInt();
		
		System.out.print("사칙연산 기호 중 하나를 입력해주세요 : ");
		String str1 = sc.nextLine();
		
		System.out.print("숫자를 입력해주세요 : ");
		String str2 = sc.nextLine();
		
		int num1 = 0; 
		int num2 = Integer.parseInt(str2);//parseInt() : String 타입 숫자를 int 타입으로 변환
		int num3 = 0;
		
		if(str1.equals("+")) {
			num3=num1+num2;
		}
		else if(str1.equals("-")) {
			num3=num1-num2;
		}
		else if(str1.equals("*")) {
			num3=num1*num2;
		}
		else if(str1.equals("/")) {
			num3=num1/num2;
		}
		
		System.out.println(n1+str2+str2+ "="+num3);
	}

}
