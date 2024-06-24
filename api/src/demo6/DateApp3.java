package demo6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApp3 {

	public static void main(String[] args) throws Exception {
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		Date date = formatter.parse("2021-01-01");
		
		System.out.println(date);
	}
}