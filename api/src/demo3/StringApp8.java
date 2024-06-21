package demo3;

public class StringApp8 {

	public static void main(String[] args) {
		
		/*
		 * 문자열 리터럴
		 *  - 문자열 리터럴은 STring 객체를 생성하고, 해당 객체의 주소값을 반환한다.
		 *  - 즉, 문자열 리터럴의 최종 결과는 String 객체를 참조하는 주소값 그 자체다.
		 *  - 따라서, "문자열리터럴".메소드()와 같은 형식으로 String의 모든 메소드를 즉시 실행할 수 있다.
		 */
		int value1 = "abc".length();
		String value2 = "abc".toUpperCase();
		
		/*
		 * 메소드 체이닝
		 * 	메소드를 실행한 결과로 다시 객체가 획득되면 이어서 그 객체의 메소드를 실행하는 것을 말한다.
		 * 	메소드 체이닝을 이용하면 코드의 가독성이 높아지고, 불필요한 변수를 생성할 필요가 없다.
		 * 
		 * ex)
		 * 	String str1 = "   xyz   ";
		 * 	String str2 = str1.trim();
		 * 	String str3 = str2.toUpperCase();
		 * 	int len = str3.length();
		 * 
		 * 	int len = "   xyz   ".trim().toUpperCase().length();
		 */
		int value3 = "   xyz   ".trim().toUpperCase().length();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}