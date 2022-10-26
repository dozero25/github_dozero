package ch11;

import java.util.Scanner;

public class BaekJoon03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year=0;
		System.out.print("년도를 입력하세요 : ");
		year = sc.nextInt();
		
		if(year < 1 || year > 4000) {
				while(year < 1 || year > 4000) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.print("다시 입력해주세요 : ");
				year = sc.nextInt();
				}
				if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0) {
					System.out.println(year+"년은 윤년입니다.");
				}
				else {
					System.out.println(year+"년은 윤년이 아닙니다.");
				}
		}
		else {
			if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0) {
				System.out.println(year+"년은 윤년입니다.");
			}
			else {
				System.out.println(year+"년은 윤년이 아닙니다.");
			}
		}
		
	}

}
