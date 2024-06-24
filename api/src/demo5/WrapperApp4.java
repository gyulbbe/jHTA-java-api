package demo5;

public class WrapperApp4 {

	public static void main(String[] args) {
		/*
		 * 자동언박싱
		 *  - 기본자료형타입의 변수에 Wrapper객체를 대입하면 자동으로 Wrapper객체에 저장된 기본자료형 값이 변수에 대입되는 것이다.
		 *  
		 *  1. 변수 x의 타입이 기본자료형 타입이다.
		 *     (언박싱이 필요한 상황이다.)
		 *  2. x.intValue()를 자동으로 실행해서 Wrapper객체에 저장된 기본자료형 값을 가죠온다.
		 *  3. 조회된 기본자료형 값을 변수 a에 대입한다.
		 */
		
		//박싱
		Integer a = new Integer(10);
		Double b = new Double(3.14);
		
		//자동언박싱
		int x = a;		// int a = a.intValue();
		double y = b;	// double y = b.doubleValue();
		
		double z = b;
//		double z = a;
		
		// 사직 연산에서의 자동언박싱
		Integer num1 = new Integer(1000);
		Integer num2 = new Integer(2000);
		
		int num3 = num1 + num2;
		System.out.println(num3);
	}
}