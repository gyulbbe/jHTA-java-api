package demo15;

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesApp2 {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		
		prop.setProperty("db.url", "jdbc.oracle:thin:@localhost:1521:xe");
		prop.setProperty("db.class-name", "oracle.jdbc.OracleDriver");
		prop.setProperty("db.username", "hta");
		prop.setProperty("db.password", "zxcv1234");
		
		String resource = "src/demo15/db.properties";
		// 지정된 리소스 파일로 데이터를 기록하는 스트림객체를 생성한다.
		FileWriter writer = new FileWriter(resource);
		//지정된 추 ㄹ력스트림을 이용해서 Properties 객체에 추가된 설정정보를 파일로 저장한다.
		
		prop.store(writer, "db.connection configuration");
	}
}