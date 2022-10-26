package ch11;

import java.util.Scanner;

public class BaekJoon05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hour = 0;
		int minute = 0;
		
		System.out.print("Hour : ");
		hour = scanner.nextInt();
		System.out.print("Minute : ");
		minute = scanner.nextInt();
		
		if(hour < 0 || hour > 23 || minute < 0 || minute > 59) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else {
			if(minute >= 45) {
				minute = minute - 45;
				System.out.println(hour+"시 "+minute+"분 으로 설정하였습니다.");
			}
			else if(minute < 45) {
				hour -= 1;
				minute = ((minute +60)-45);
				System.out.println(hour+"시 "+minute+"분 으로 설정하였습니다.");
			}
		}
		
		
		
	}

}
