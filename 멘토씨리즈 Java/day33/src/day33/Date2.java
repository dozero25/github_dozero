package day33;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date2 {

	public static void main(String[] args) {
//		Calendar a= new Calendar(); 불가
		Calendar a= Calendar.getInstance();
		Calendar b=new GregorianCalendar();
		
		System.out.println(a.toString());
		System.out.println(b.toString());

	}

}
 