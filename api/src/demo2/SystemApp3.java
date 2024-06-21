package demo2;

import java.util.Date;

public class SystemApp3 {

	public static void main(String[] args) {
		
		/*
		 * System.currentTimeMillis()
		 * 	시스템의 유닉스 타임값을 반한한다.
		 * 	유닉스 타임: 1970년 1월 1일 0시 0분 0초 
		 * 			  시간을 1/1000초 단위로 환산한 값이다.
		 * 	활용
		 * 		유닉스타임값을 접두사로 붙여서 이름 중복을 방지한다.
		 * 		ex) 1718932954722 + 이력서.hwp = 1718932954722이력서
		 * 
		 * 		프로그램 실행시간 체크
		 * 		난수처럼 사용
		 */
		long unixTime = System.currentTimeMillis();
		System.out.println(unixTime);
		
		//유닉스 타임 0일 때의 날짜와 시간정보를 가진 Date객체 생성하기
		Date date1 = new Date(0);
		System.out.println(date1);
	}
}