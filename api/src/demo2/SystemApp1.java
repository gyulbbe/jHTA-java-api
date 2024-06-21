package demo2;

public class SystemApp1 {

	public static void main(String[] args) throws Exception {

		// System.in은 키보드 입력을 읽어오는 객체를 참조한다.
		int value = System.in.read();
		System.out.println((char)value);
	}

}
