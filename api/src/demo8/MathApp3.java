package demo8;

/*
 * static import 구문
 * 	정적변수, 정적 메소드를 import시키는 구문이다.
 * 	클래스를 import 하는 것이 아니라 정적변수, 정적 메소드를 import 한다.
 * 	코드에서 클래스이름.정적변수 대신 정적변수만 적는다.
 * 		  클래스이름.정적메소드 대신 정적메소드만 적는다.
 */
import static java.lang.Math.ceilDiv;
public class MathApp3 {

	public static void main(String[] args) {

		/*
		 * 한 화면에 10개씩 상품을 표시할 때, 상품갯수당 필요한 총 페이지 수를 계산하기
		 * 
		 * int 페이지수 = Math.ceilDiv(상품갯수, 표시갯수)
		 */
		System.out.println(ceilDiv(1, 10));
		System.out.println(ceilDiv(4, 10));
		System.out.println(ceilDiv(10, 10));
		System.out.println(ceilDiv(12, 10));
		System.out.println(ceilDiv(17, 10));
		System.out.println(ceilDiv(20, 10));
		System.out.println(ceilDiv(23, 10));
	}
}