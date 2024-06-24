package demo6;

import java.util.Date;

public class DateApp4 {

	public static void main(String[] args) {
		
		// DateUtils 클래스의 정적메소드를 이용해서 Date객체를 원하는 형식의 문자열로 변환하기
		
		Date now = new Date();
		
		String text1 = DateUtils.format(now);
		System.out.println(text1);
		
		String text2 = DateUtils.format(now, "yy년 M월 d일");
		System.out.println(text2);
		
		String text3 = DateUtils.format(now, "HH:mm:ss");
		System.out.println(text3);
		
		
	}
}