package demo3;

public class StringApp6 {

	public static void main(String[] args) {
	
		/*
		 * String[] split (String index)
		 *  이 문자열을 저장된 표현식에 해당하는 글자를 기준으로 조각내고 각각의 조각들을 배열에 담아서 반환한다.
		 */
		String str1 = "김유신,홍길동,이순신,류관순,강감찬";
		//values -> {"김유신", "홍길동", "이순신", "류관순", "강감찬"}
		String[] values = str1.split(",");
		System.out.println(values[0]);
		
		String str2 = "김유신,100,90,70";
		String[] values2 = str2.split(",");
		String name = values2[0];
		/*
		 * static int Integer.parseInt(String str)
		 *  - 문자열을 정수로 변환해서 반환한다.
		 *  - 문자열은 숫자형의 값만 포함하고 있어야 한다.
		 */
		int kor = Integer.parseInt(values2[1]);
		int eng = Integer.parseInt(values2[2]);
		int math = Integer.parseInt(values2[3]);
		
		int total = kor + eng + math;
		int average = total/3;
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
	}
}