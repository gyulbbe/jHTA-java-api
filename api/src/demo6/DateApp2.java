package demo6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApp2 {

	public static void main(String[] args) {
		
		/*
		 * SimpleDateFormat
		 * 	문자열을 Date타입의 객체로 변환시키는 기능과 Date타입의 객체를 지정된 형식의 문자열로 변환하는 기능을 제공한다.
		 * 	주요 API
		 * 		생성자
		 * 			SimpleDateFormat()
		 * 				기본 생성자 메소드
		 * 			SimpleDateFormat(String pattern)
		 * 				패턴문자열을 전달받아서 초기화하는 생성자 메소드
		 * 		주요 메소드
		 * 			String format(Date date)
		 * 				전달받은 Date객체의 날짜와 시간정보를 지정된 패턴형식의 문자열로 변환해서 반환한다.
		 * 			Date parse(String text)
		 * 				지정한 패턴형식에 맞게 작성된 문자열을 전달받아서 Date객체로 변환해서 반환한다.
		 */
		
		Date now = new Date();
		
		String pattern1 = "yyyy-MM-dd";
		String pattern2 = "yyyy-M-d";
		String pattern3 = "yyyy년 M월 d일";
		String pattern4 = "yyyy년 M월 d일 EEEE";
		String pattern5 = "HH:mm:ss";
		String pattern6 = "a h시 m분 s초";
		String pattern7 = "yyyy.MM.dd a h:m:s";
		
		SimpleDateFormat formatter = new SimpleDateFormat(pattern7);
		String text = formatter.format(now);
		System.out.println(text);
	}
}
