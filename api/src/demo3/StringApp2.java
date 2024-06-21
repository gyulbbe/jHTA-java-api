package demo3;

public class StringApp2 {

	public static void main(String[] args) {
		/*
		 * boolean equals(Object obj)
		 * 	- 문자열의 동등성을 비교하는 메소드다.
		 * 	- String객체가 서로 달라도 문자열의 내용이 일치하면 true를 반환한다.
		 *  - Object의 equals(Object obj)를 재정의한 것이다.
		 *  
		 * boolean equalsIgnoreCase(String anotherString)
		 *  - 문자열의 동등성을 비교하는 메소드다.
		 *  - 단, 대소문자를 구분하지 않고 구분한다.
		 *    a와 A를 같은 글자로 취급한다.
		 */
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		//동일성 비교
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		
		//동등성 비교
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		/*
		 * 문자열의 비교는 equals() 메소드를 반드시 사용하도록 하자!
		 */
		
		String str5 = "Hello";
		String str6 = "hello";
		
		System.out.println(str5.equals(str6));//false
		System.out.println(str5.equalsIgnoreCase(str6));//true
	}
}