package demo6;

import java.util.Date;

public class DateApp {

	public static void main(String[] args) {
		
		/*
		 * java.util.Date
		 * 	시스템의 현재 날짜와 시간정보를 표현한다.
		 * 
		 * 주요API
		 * 	생성자
		 * 		Date()
		 * 			시스템의 현재 날씨와 시간정보를 Date객체를 초기화 한다.
		 * 		Date(long date)
		 * 			전달받은 유닉스 타입으로 Date객체를 초기화한다.
		 * 
		 * 주요 메소드
		 * 	long getTime()
		 * 		유닉스타입값을 반환한다.
		 * 	boolean after(Date when)
		 * 		전달받은 날짜보다 이 날짜가 이후 날짜이면 true
		 * 	boolean before(Date when)
		 * 		전달받은 남자가 이 날짜가 이전 날짜이면 true
		 * 	boolean equals()메소드를 재정의하였다.
		 * 	String toString()
		 * 		이 날짜에 대한 간단한 정보를 문자열로 반환한다.
		 * 		Object의 toSTring()메소드를 재정의하였다.
		 * 
		 */
		
		// 시스템의 현재 날짜와 시간정보를 표현하는 Date객체 생성
		Date now = new Date();
		long nowUnixTime = now.getTime();
		
		System.out.println(now);
		System.out.println("현재 유닉스 타임: " + nowUnixTime);
		
		// 현재를 기준으로 1일전 날짜와 시간정보를 표현하는 Date객체를 생성
		Date dayFor1DayAgo = new Date(nowUnixTime - (60*60*24*1000)*1);
		Date dayFor3DayAgo = new Date(nowUnixTime - (60*60*24*1000)*3);
		Date dayFor1WeekAgo = new Date(nowUnixTime - (60*60*24*1000)*7);
		
		System.out.println(dayFor1DayAgo);
		System.out.println(dayFor3DayAgo);
		System.out.println(dayFor1WeekAgo);
	}
}