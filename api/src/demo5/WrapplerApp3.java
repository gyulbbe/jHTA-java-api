package demo5;

public class WrapplerApp3 {

	public static void main(String[] args) {
		
		/*
		 * 자동박싱
		 *  - 변수의 타입이 Wrapper 클래스 타입이면 자동으로 기본자료형 값을 가지고 있는 Wrapper객체를 생성하고, 그 객체의 주소값을 변수에 대입한다.
		 *  
		 * Integer a = 10;
		 * 	1. a변수의 타입이 Integer 타입이다.
		 *     (기본자료형 타입이 아니다. 오토박싱이 필요한 상황이다.)
		 *  2. 10을 저장하는 Integer객체를 생성한다.
		 *  3. 생성한 Integer객체의 주소값을 a에 대입한다.
		 *  4. a는 Integer객체를 참조한다.
		 */
		
		Integer a = 10;			// Integer a = new Integer(10);
		Double b = 3.14;		// Double b = new Double(3.14);
		Long c = 10000000000L;	// Long = new Long(10000000000L);
		
		/*
		 * Object x = 10;
		 *  1. x변수의 타입이 Object 타입이다.
		 *     (Object는 모든 객체를 담을 수 있는 타입이다.
		 *      즉, Integer 객체를 생성하면 문제가 없는 상황이다.
		 *         오토박싱이 필요한 상황이다.)
		 *  2. 10을 저장하는 Integer객체를 생성한다.
		 *  3. 생성한 Integer객체의 주소값을 x에 대입하려고 했더니 클래스 형변환이 발생해서 Integer 객체를 생성할 때 함께 생성된 Object객체의 주소값이 x에 대입한다.
		 *  4. x는 Object객체를 참조한다.
		 */
		
		Object x = 10;				// Integer a = new Integer(10);
		Object y = 3.14;			// Double b = new Double(3.14);
		Object z = 10000000000L;	// Long = new Long(10000000000L);
		
		// x가 참조하는 Object객체의 toString() 호출한다.
		// 하지만, Integer객체에 toString()이 재정의되어 있기 때문에
		// 실제로 실행되는 것은 Integer객체의 toString()반환값이 출력된다.
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}