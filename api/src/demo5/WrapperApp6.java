package demo5;

public class WrapperApp6 {

	public static void main(String[] args) {
		
		/*
		 * 문자열 -> 기본자료형값 변환하기
		 * 
		 * 문자열			변환하기(정적메소드)					기본자료형
		 *--------------------------------------------------------
		 * "100"		Integer.parseInt("100")			100
		 * "3.14"		Double.parseDouble("3.14")		3.14
		 * "1000000000"	Long.parseLong("1000000000")	1000000000
		 * "true"		Boolean.parseBoolean("true")	true
		 * 
		 * 문자열 -> Wrapper 객체로 변환하기
		 * 
		 * 문자열			변환하기(정적메소드)					Wrapper객체
		 *-----------------------------------------------------------
		 * "100"		Integer.valueOf("100")			Integer객체
		 * "3.14"		Double.valueOf("3.14")			Double객체
		 */
		
		String str1 = "1500000";
		String str2 = "3";
		
		int price = Integer.parseInt(str1);
		int amount = Integer.parseInt(str2);
		int total = price*amount;
		System.out.println("total: " + total);
	}
}
