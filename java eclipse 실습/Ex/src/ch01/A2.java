package ch01;

import java.util.Scanner;

public class A2 {
	//할인 대상인지 아닌지 출력
	//20세 미만, 60세 이상 할인 대상
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age=sc.nextInt();
		if(age<20) {
			System.out.println("미성년 할인대상자 입니다.");
			if(age<=7) {
				System.out.println("0~7세 입니다. 전액 무료입니다!!");
			}
			else if(age<=13) {
				System.out.println("8~13세 입니다. 70%할인!!");
			}
			else if(age<=19) {
				System.out.println("14~19세 입니다. 50%할인!!");
			}
		}
		else if(age>60) {
			System.out.println("노약자 할인대상자 입니다.");
			System.out.println("50% 할인!!");
			
		}
		else {
			System.out.println("할인 대상자가 아닙니다.");
		}
		

	}

}
