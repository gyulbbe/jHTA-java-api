package demo3;

public class StringApp4 {

	public static void main(String[] args) {

		/*
		 * String toUpperCase()
		 * 	이 문자열의 모든 문자를 대문자로 바꾼 새 문자열을 반환한다.
		 * String toLowerCase()
		 * 	이 문자열의 모든 문자를 소문자로 바꾼 새 문자열을 반환한다.
		 * String trim()
		 * 	이 문자열의 좌/우 공백문자를 제거한 새 문자열을 반환한다.
		 * String replace(CharSequence target, CharSequence replacement)
		 * 	이 문자열에서 target으로 지정한 것과 매치되는 글자를 replacement에서 지정한 것으로 변경한 새 문자열을 반환한다.
		 * 
		 */
		
		String str1 = "The String class represents character strings";
		String value1 = str1.toUpperCase();
		System.out.println(value1);
		
		String str2 = "			The String class		represents		";
		String value2 = str2.trim();
		System.out.println("["+value2+"]");
		
		String str3 = "The String class represents character strings";
		String value3 = str3.replace("s", "*");
		System.out.println(value3);
	}

}
