package demo3;

public class StringApp1 {

	public static void main(String[] args) {
		/*
		 * int length()
		 * 	문자열의 길이를 반환한다.
		 */
		String str1 = "Returns the length of this string.";
		int len = str1.length();
		System.out.println("문자열의 길이: " + len);
		
		/*
		 * boolean isEmpty()
		 * 	문자열의 길이가 0이면 true를 반환한다.
		 *  비어있는 문자열: ""
		 * boolean isBlank()
		 * 	문자열이 비어있거나 white space(공백, 탭 등)으로 구성되어 있으면 true를 반환한다.
		 * 				isEmpty()	isBlank()
		 * -------------------------------------
		 * ""			true		true
		 * -------------------------------------
		 * "	"		false		true
		 * -------------------------------------
		 * "abc"		false		false
		 * -------------------------------------
		 */
		
		String value2 = "abc";
		String value3 = "	";
		String value4 = "";
		
		System.out.println(value2.isEmpty()); //false
		System.out.println(value3.isEmpty()); //false
		System.out.println(value4.isEmpty()); //true
		
		System.out.println(value2.isBlank()); //false
		System.out.println(value3.isBlank()); //true
		System.out.println(value4.isBlank()); //true
	}
}
