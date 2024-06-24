package demo5;

public class WrapperApp5 {

	public static void main(String[] args) {
		
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		
		/*
		 * == 연산자와 equals()메소드
		 *  == 연산자의 Wraper객체의 주소값을 비교한다.(동일성 비교)
		 *  equals() 메소드는 객체에 저장된 기본자료형 값을 비교한다.(동등성 비교)
		 *  
		 *  모든 Wrapper 클래스는 Object의
		 *   String toString()
		 *   	Wrapper객체에 저장된 기본자료형값을 문자열로 반환한다.
		 *   int hashCode()
		 *   	Wrapper객체에 저장된 기본자료형값이 같으면 같은 해시코드값을 반환한다.
		 *   boolean equals(Object obj)
		 *   	Wrapper객체에 저장된 기본자료형값이 같으면 true를 반환한다.(동등성을 비교하도록 재정의)
		 *  메소드를 재정의하고 있다.
		 */
		
		System.out.println(x == y);			//false
		System.out.println(x.equals(y));	//true
		
		Integer a = new Integer(10);
		int b = 10;
		
		System.out.println(a == b);
	}
}