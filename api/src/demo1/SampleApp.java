package demo1;

public class SampleApp {

	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		Sample s4 = s1;
		
		/*
		 * boolean equals(Object other);
		 *  - 이 객체와 다른 객체가 동일한 객체인지 확인해서 같은 객체면 true를 반환
		 */
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		/*
		 * int hashCode()
		 *  - 이 객체의 해시코드값을 정수값으로 반환한다.
		 *    같은 객체라면 해시코드 값이 동일하다.
		 *  - 해시코드값은 객체마다 다른 값이 나오도록 코딩된 메소드의 실행결과로 획득되는 정수값이다.
		 *  - 해시코드값을 비교하면 쉽게 두 객체가 같은 객체인지 확인할 수 있다.
		 *  - 해시코드값은 객체의 주소값과는 다른 값이다.
		 */
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		/*
		 * String toString()
		 *  - 이 객체에 대한 간단 정보를 문자열로 반환한다.
		 *  - 패키지명.클래스명 + @ + 16진수해시코드값
		 */
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
		/*
		 * 참조변수의 값을 출력하려고 하면 실제 참조변수의 값이 출력되는 것이 아니라, 참조변수가 참조하는 객체의 toString()을 실행한 결과가 출력된다.
		 */
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}