package demo5;

public class WrapperApp1 {

	public static void main(String[] args) {

		/*
		 * 기본자료형 값을 담는 객체를 생성하는데 사용되는 클래스다.
		 * 기본자료형 값을 Wrapper 객체를 생성해서 저장하는 것을 박싱(Boxing)이라고 한다.
		 */
		
		// 기본자료형 타입의 값을 Wrapper 객체에 저장하기
		// 생성자를 이용한 초기화 방법은 Java9부터 폐기예정으로 변경
		Integer a = new Integer(10);
		Integer b = new Integer("1234");
		// 정적 메소드 Integer.valueof()를 이용하면 Wrapper 객체를 획득할 수 있다.
		Integer c = Integer.valueOf(10);
		Integer d = Integer.valueOf("1234");
		Integer e = Integer.valueOf("100", 2);
		
		// Integer는 Object클래스의 toString() 메소드를 재정의해서 Wrapper객체에 저장된 기본자료형을 문자열로 변환해서 반환한다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);// "10"
		System.out.println(d);// "1234"
		System.out.println(e);// "4"
	}

}
