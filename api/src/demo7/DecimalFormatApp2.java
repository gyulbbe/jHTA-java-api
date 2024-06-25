package demo7;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatApp2 {

	public static void main(String[] args) throws ParseException {
		
		DecimalFormat formatter1 = new DecimalFormat("##,###");
		Number number1 = formatter1.parse("10,000");
		int value1 = number1.intValue();
		System.out.println(value1);
		
		DecimalFormat formatter2 = new DecimalFormat("##,###");
		Number number2 = formatter2.parse("3.14159");
		double value2 = number2.doubleValue();
		System.out.println(value2);
	}
}
