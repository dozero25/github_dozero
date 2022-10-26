package day34;

import java.time.LocalDateTime;

public class After2 {
	//isAfter() 메서드를 사용해 유통기한 점검하는 실습
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime end_time = LocalDateTime.of(2017,6,24,12,00);
		System.out.println(end_time);
		if(ldt.isAfter(end_time)) {
			System.out.println("유통기한이 지났습니다!");
		}
		else {
			System.out.println("유통기한이 지나지 않았습니다.");
		}

	}

}
