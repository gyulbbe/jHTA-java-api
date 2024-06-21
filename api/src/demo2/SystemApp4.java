package demo2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SystemApp4 {

	public static void main(String[] args) {
		/*
		 * 시스템에 설정된 환경변수값을 조회할 수 있다.
		 * 	Map<String, String> getenv()
		 * 		시스템의 모든 환경변수값을 Map객체에 담아서 반환한다.
		 * 	String getenv(String name)
		 * 		지정된 이름의 시스템 환경변수값을 반환한다.
		 */

		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		
		String value2 = System.getenv("Path");
		System.out.println(value2);
		
		String value3 = System.getenv("OS");
		System.out.println(value3);
		
		Map<String, String> map = System.getenv();
	      Set<Entry<String, String>> entries = map.entrySet();
	      for (Entry<String, String> entry : entries) {
	         System.out.println("[" + entry.getKey() + "] => " + entry.getValue());
	      }
	}
}