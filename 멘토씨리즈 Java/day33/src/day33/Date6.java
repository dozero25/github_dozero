package day33;

import java.sql.Date;
import java.util.Calendar;

public class Date6 {

	public static void main(String[] args) {
		//Calendar -> Date
		Calendar calendar = Calendar.getInstance();
		Date date = (Date) calendar.getTime();
		System.out.println(date);
		
		//Date -> Calendar
		calendar.setTime(date);
		
		//Calendar -> long
		long time = calendar.getTimeInMillis();
		System.out.println(time);
		
		//long -> Calendar
		calendar.setTimeInMillis(time);
	}

}
