package day34;

import java.time.LocalDate;

public class WithPrac {
	//간단하게 날짜 변경하는 코드
	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		LocalDate new_ld=ld.withYear(1999).withMonth(8).withDayOfYear(23);
		System.out.println(new_ld);
		
		
		//withDayOfYear(int) : 년을 기준으로 지난 일자
		//withDayOfMonth(int) : 월을 기준으로 지난 일자
	}

}
