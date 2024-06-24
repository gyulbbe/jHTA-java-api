package demo6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarApp2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		
		System.out.println(cal);
		
		Date date = cal.getTime();
		System.out.println(date);
		
		Calendar cal2 = new GregorianCalendar(2024, 0, 1);
		date = cal2.getTime();
		System.out.println(date);
	}
}
