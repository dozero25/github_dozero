package day07;

import java.util.Scanner;

public class If_else_if {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.print("나이 : ");
		age=sc.nextInt();
		
		if(age>19) {
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		}
		else if(age>13) {
			System.out.println("청소년입니다");
			System.out.println("청소년 요금이 적용됩니다");
		}
		//위에 오는 조건만을 부정
		else if(age>=8) {
			System.out.println("초등학생입니다");
			System.out.println("초등학생 요금이 적용됩니다.");
		}
		else if(age>=1) {
			System.out.println("유아입니다.");	
		}
		if(age>=8) {
			System.out.println("결제를 진행해 주세요.");
		}
		else if(age>1) {
			System.out.println("유아요금은 무료입니다.");}
		}
}
