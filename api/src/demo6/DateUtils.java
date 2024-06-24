package demo6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	private static final String DEFAULT_PATTERN = "yyyy-MM-dd";
	private static final SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_PATTERN);

	public static Date parse(String text) {
		return DateUtils.parse(text, DEFAULT_PATTERN);
	}
	
	/**
	 * 지정된 패턴과 일치하는 날짜형식의 문자열을 받아서 Date객체로 반환한다.
	 * @param text 지정된 패턴과 일치하는 형식의 문자열
	 * @param pattern 날짜 패턴
	 * @return 날짜
	 */
	public static Date parse(String text, String pattern) {
		try {
			sdf.applyPattern(pattern);
			return sdf.parse(text);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Date를 전달받아서 "yyyy-MM-dd"형식의 문자열로 변환해서 반환한다.
	 * @param date 날짜
	 * @return "yyyy-MM-dd" 형식의 문자열
	 */
	public static String format(Date date) {
		if(date == null) {
			return null;
		}
		return DateUtils.format(date, DEFAULT_PATTERN);
	}

	/**
	 * Date와 패턴을 전달받아서 지정된 형식의 문자열로 변환해서 반환한다.
	 * @param date 날짜
	 * @param pattern 포맷팅 패턴
	 * @return 지정된 패턴의 문자
	 */
	public static String format(Date date, String pattern) {
		if(date == null) {
			return null;
		}
		sdf.applyPattern(pattern);
		return sdf.format(date);
	}
	
	/**
	 * 날짜, 구분, 값을 전달받아서 지정된 날짜에서 지정된 시간만큼 경과된 날짜를 반한한다.
	 * @param date 날짜
	 * @param type 구분(y:년, M:월, w:주, d:일, h:시, m:분, s:초)
	 * @param amount 증가할 값
	 * @return 증가값이 반영된 날짜
	 * 
	 * DateUtils.plus(now, 'w', 2)
	 */
//	public static Date plus(Date date, String type, int amount) {
//
//	}
//	
//	public static Date minus(Date date, String type, int amount) {
//		
//	}
//	
//	public static Date gap(Date date, String type, int amount) {
//		
//	}
	
}