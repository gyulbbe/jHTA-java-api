package demo4;

public class StringBufferApp {

	public static void main(String[] args) {
		/*
		 * StringBuffer
		 *	StringBuilder와 동일한 API를 가지고 있다.
		 *	멀티 스레드 환경에서 Thread-safe하다.
		 */
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("김유신")
			.append(",")
			.append("80")
			.append(",")
			.append("90")
			.append(",")
			.append("100");
			
		String text = buffer.toString();
		
		//StringBuffer객체의 toString()이 실행된 것이다.
		System.out.println(buffer);
		//String객체의 toString()이 실행된 것이다.
		System.out.println(text);
			
	}
}