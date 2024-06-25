package demo8;

import java.util.Random;

public class MathApp1 {

	public static void main(String[] args) {

		/*
		 * Math
		 *  - 수학 계산과 관련된 기능을 제공하는 클래스
		 *  - 정적필드, 정적메소드로 구성되어있다.
		 *  
		 *  - 주요 메소드
		 *  	static double random()
		 *  		0 <= 실수 < 1, 이 범위에 속하는 임의의 실수를 반환한다.
		 *  		특정 범위의 난수를 발생시킬 때 사용한다.
		 *  
		 *  	static long round(double a), static int round(float b)
		 *  		반올림된 정수값을 반환한다.
		 *  
		 *  	static double ceil(double value)
		 *  	static int deilDiv(int x, int y)
		 *  		x를 y로 나눈 계산 결과를 ceil값으로 반환한다.
		 *  
		 *  	static double floor(double value)
		 *  	static int floorDiv(int x, int y)
		 *  		x를 y로 나눈 계산 결과를 floor값으로 반환한다.
		 *  
		 *  	static int max(int x, int y)
		 *  	static int min(int x, int y)
		 *  
		 *  	static double pow(double a, double b)
		 *  		a^b 즉, a의 b제곱값을 반환한다.
		 */
		
		double number1 = Math.random();
		System.out.println(number1);
		
		double number2 = Math.random();
		System.out.println(number2);
		
		double number3 = Math.random();
		System.out.println(number3);
		
		/*
		 * 0 <= Math.random() < 1
		 * 0 <= Math.random() * 10 < 10
		 * 1 <= Math.random() * 10 + 1 < 11
		 * 1 <= (int) (Math.random() * 10) + 1 < 11
		 */
		
		// 1 ~ 10 범위의 정수값이 반환된다.
		int num1 = (int)(Math.random()*10) + 1;
		System.out.println(num1);
		
		// 1 ~ 45 범위의 로또 번호가 반환된다.
		int num2 = (int)(Math.random()*45) + 1;
		System.out.println(num2);
		
		// 1 ~ 6 범위의 주사위 번호가 반환된다.
		int num3 = (int)(Math.random()*6) + 1;
		System.out.println(num3);
		
		System.out.println();
		
		/*
		 * java.util.Random
		 * 	주요 API
		 * 		메소드
		 * 			int nextInt()
		 * 				int 범위의 모든 정수값 중 하나가 반환된다.
		 * 			int next(int bound)
		 * 				0 <= 숫자 < bound, 범위의 정수값이 반환된다.
		 */
		Random random = new Random();
		int value = random.nextInt(5) + 1;// 1, 2, 3, 4, 5
		System.out.println(value);
	}
}