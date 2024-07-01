package demo14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapApp4 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("host", "192.168.10.10");
		map.put("username", "admin");
		map.put("password", "zxcv1234");
		
		/*
		 * Set<Key> keySet()
		 * 	Map객체에 저장된 모든 key값을 set객체에 담아서 반환한다.
		 *  Set객체에 담아서 반환하는 이유는 key는 중복되지 않는 값이다.
		 */
		Set<String> keys = map.keySet();
//		System.out.println(keys);
		for(String key : keys) {
			String value = map.get(key);
			System.out.println("["+key+"]["+value+"]");
		}
	}
}
