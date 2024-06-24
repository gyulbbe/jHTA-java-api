package demo6;

import java.util.Calendar;

public class CalenderApp {

	public static void main(String[] args) {
		
		/*
		 * Calender
		 *  - 추상클래스다.
		 *  - Date에 비해서 더 자세한 날짜와 시간정보를 표현하는 클래스다.
		 *  - 다양한 구현 클래스가 존재한다.
		 *   GregorianCalender - 그레고리우스 역법
		 *   
		 *  주요 API
		 *   상수
		 *		Calendar.Year
		 *			년
		 *		Calendar.MONTH
		 *			월
		 *		Calendar.DAY_OF_MONTH
		 * 			일
		 * 		Calendar.HOUR
		 * 			시
		 * 		Calendar.MINUTE
		 * 			분
		 * 		Calendar.SECOND
		 * 			초
		 * 
		 *   정적 메소드
		 *   	Calendar Calendar.getInstance()
		 *   		현재 날짜와 시간정보를 표현하는 Calendar객체가 반환된다.
		 *   		실제로는 GregorianCalendar객체가 반환된다.
		 *   
		 *   멤버 메소드
		 *   	int get(int field)
		 *   		지정된 field상수 값에 해당하는 정보를 반환한다.
		 *   	void set(int field. int value)
		 *   		지정된 field상수 값에 해당하는 정보를 변경한다.
		 *   	Data getTime()
		 *   		날짜와 시간정보를 표현하는 Date객체를 반환한다.
		 *   	long getTimeInMillis()
		 *   		유닉스타임값을 반환한다.
		 */
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}
}