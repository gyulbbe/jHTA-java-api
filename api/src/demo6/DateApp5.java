package demo6;

import java.util.Date;

public class DateApp5 {

	public static void main(String[] args) {
		// 날짜 형식의 문자열을 Date로 변환하기
		Date date = DateUtils.parse("2099-12-31");
		System.out.println(date);
	}
}
