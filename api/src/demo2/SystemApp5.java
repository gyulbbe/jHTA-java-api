package demo2;

public class SystemApp5 {

	public static void main(String[] args) {
		
	/*
	 * 시스템 설정정보를 조회하기
	 * 
	 * Properties getProperties()
	 * 	시스템의 모든 설정정보를 Properties 객체에 담아서 반환한다.
	 * String getProperty(String key)
	 * 	지정된 key에 해당하는 시스템 설정정보를 반환한다.
	 */
	
	String value = System.getProperty("java.version");
	System.out.println("자바버전: " + value);
	
	String value2 = System.getProperty("java.home");
	System.out.println("자바홈: " + value2);
	
	String value3 = System.getProperty("java.vendor");
	System.out.println("자바 제조사: " + value3);
	
	String value4 = System.getProperty("user.name");
	System.out.println("사용자 이름: " + value4);
	
	String value5 = System.getProperty("user.home");
	System.out.println("사용자 홈: " + value5);
	
	String value6 = System.getProperty("user.dir");
	System.out.println("현재 작업 디렉토리: " + value6);
	
	String value7 = System.getProperty("file.separator");
	System.out.println("경로 구문문자: " + value7);
	
	String value8 = System.getProperty("line.separator");
	System.out.println("줄바꿈문자: " + value8);
	}
}
