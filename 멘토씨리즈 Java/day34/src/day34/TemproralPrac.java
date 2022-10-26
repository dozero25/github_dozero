package day34;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class TemproralPrac {
	//with()메서드 실습
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		LocalDateTime new_ldt;
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올해의 첫번째 날 : "+new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해의 마지막 날 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이반달의 첫번째 날 : "+new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번달의 마지막 날 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫번째 월요일 : "+new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println("이번 달의 마지막 일요일 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("돌아오는 금요일 : "+new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("오늘을 포함한 다음 금요일 : "+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : "+new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("오늘을 포함한 지난 월요일 : "+new_ldt);
		

	}

}
