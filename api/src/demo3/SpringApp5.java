package demo3;

public class SpringApp5 {

	public static void main(String[] args) {
		/*
		 * String substring(int beginIndex)
		 * 	이 문자열에서 지정된 시작위치부터 잘라낸 새 문자열을 반환한다.
		 * String substring(int beginIndex, int denIndex)
		 * 	이 문자열에서 지정된 범위만큼 잘라내 새 문자열을 반환한다.
		 * 
		 * beginIndex는 포함, endIndex는 포함되지 않는다.
		 */
		
		String str = "Returns a string that is a substring of this string.";
		String value1 = str.substring(10);
		System.out.println(value1);
		
		String value = str.substring(2, 5);
		System.out.println(value);
		
		
	}
}
