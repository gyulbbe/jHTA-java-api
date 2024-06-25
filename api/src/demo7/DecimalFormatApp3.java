package demo7;

public class DecimalFormatApp3 {

	public static void main(String[] args) {

		/*
		 * Integer.parseInt(String text)
		 * 	숫자, 부호(+ -)로 구성된 문자열을 정수로 변환한다.
		 * 	그 외에 다른 문자 있는 경우, 불필요한 문자를 제거한 다음에
		 * 	정수로 변환한다.
		 */
		String text1 = "100,000,000";
		text1 = text1.replace(",", "");
		int value1 = Integer.parseInt(text1);
		System.out.println(value1);
	}
}