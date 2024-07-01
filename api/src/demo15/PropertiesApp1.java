package demo15;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesApp1 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * java.util.properties
		 *  .properties 파일에 저장된 설정정보를 표현하는 객체다.
		 *  Properties객체를 잉ㅇ하면 설정정보를 읽어오거나 저장할 수 있다.
		 *  Properties클래스는 key와 value의 타입이 전부 String 타입이다.
		 *  (제네릭 타입을 지정할 필요가 없다.)
		 *  
		 *  주요 API
		 *   void load(InputStream in)
		 *    지정된 스트림을 이용해서 파일에 설정된 정보를 읽어온다.
		 *   void load(Reader in)
		 *    지정된 스트림을 이용해서 파일에 설정된 정보를 읽어온다.
		 *   String getProperty(String name)
		 *    지정된 이름으로 설정된 값을 반환한다.
		 *   String getProperty(String name, String defaultValue)
		 *    지정된 이름으로 설정된 값을 반환한다.
		 *    지정된 이름으로 설정된 값이 없으면 defaultValue로 지정된 값을 반환한다.
		 *   Object setProperty(String name, String value)
		 *    지정된 name, value 쌍을 객체에 저장한다.
		 *   void store(OutputStream pit, String comments)
		 *    지정된 출력스트림을 이용해서 파일에 설정정보와 주석내용을 기록한다.
		 *   void store(Writer out, String comments)
		 *    지정된 출력스트림을 이용해서 파일에 설정정보와 주석내용을 기록한다.
		 */
		
		Properties prop = new Properties();
		
		String resource = "src/demo15/sample.properties";
		// 지정된 리소스를 읽어오는 Reader객체를 생성한다.
		FileReader reader = new FileReader(resource);
		// 지정된 Reader객체를 이용해서 리소스를 읽고 정보를 Properties 객체에 저장한다.
		prop.load(reader);
		
		String value1 = prop.getProperty("email.host");
		System.out.println(value1);
		int value2 = Integer.parseInt(prop.getProperty("email.port"));
		System.out.println(value2);
	}
}