package demo2;

public class SystemApp2 {

	public static void main(String[] args) {
		
		/*
		 * System.out은 표준출력장치와 연결된 printStream객체를 참조한다.
		 * PrintStream 객체의 주요 메소드
		 * void print()
		 * 	전달 받은 값을 출력한다.
		 * 	다음 출력은 기존 출력의 오른쪽에 이어서 출력된다.
		 * 
		 * void println()
		 * 	전달 받은 값을 출력하고, 줄바꿈문자를 출력한다.
		 * 	다음 출력은 새로운 행에서 출력된다.
		 * 
		 * void printf("출력포맷", 값, 값)
		 * 
		 * printf(String format, Object... args)
		 * 	format: 출력형식
		 * 	args: 값
		 * 	* Object... args는 가변길이 매개변수다.
		 * 	  임의의 갯수의 값을 매개변수의 인자로 전달받을 수 있다.
		 *    가변길이 매개변수는 항상 매개변수의 맨 마지막에 정의한다.
		 * 	ex) System.out printf("출력형식", 10);
		 * 	ex) System.out printf("출력형식", 10, 20, 30, 40);
		 * 	ex) System.out printf("출력형식", "홍길동", "김유신", "강감찬");
		 * 
		 * 	출력형식
		 * 		%d: 정수
		 * 		%s: 문자열
		 * 		%f: 실수
		 */
		
		System.out.printf("%10d %20s %30s\n", 100, "홍길동", "김유신");
		System.out.printf("%-10d %-20s %-30s", 100, "홍길동", "김유신");
		
		System.out.println("안\t녕\t하\t세\t요");
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("안\\녕\\하\\세\\요");
		System.out.println("\"홍길동\"님, 안녕하세요");
		
	}
}