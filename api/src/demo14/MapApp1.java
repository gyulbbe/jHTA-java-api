package demo14;

import java.util.HashMap;
import java.util.Map;

public class MapApp1 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		/*
		 * Object put(K key, V value)
		 * 	- Map 객체에 key, value 쌍을 저장한다.
		 * 	- key값은 고유해야 한다.
		 * 	- 만약, key값이 중복되면 기존 value값을 덮어쓴다.
		 */
		map.put("id", "hong");
		map.put("name", "홍길동");
		map.put("email", "hong@gmail.com");
		map.put("tel", "010-111-111");
		
		/*
		 * int size()
		 * 	- Map객체에 저장된 key, value쌍의 갯수를 변환한다.
		 */
		int size = map.size();
		System.out.println(size);
		
		/*
		 * boolean containKey(Object key)
		 * 	- Map 객체에 저장된 key로 저장된 Entry가 있으면 true를 반환한다.
		 * 	- Map 객체에 정보가 존재하는지 확인하는 용도로 사용하는 메소드다.
		 */
		boolean exist = map.containsKey("name");
		System.out.println(exist);
		
		/*
		 * V get(Object key)
		 * 	- Map객체에서 지정된 key값으로 저장된 value를 반환한다.
		 * 	- 지정된 key값에 해당하는 정보가 존재하지 않으면 null을 반환한다.
		 */
		String value1 = map.get("name");
		String value2 = map.get("zipcode");
		System.out.println(value1);
		System.out.println(value2);
		
		/*
		 * V remove(Object key)
		 * 	- Map객체에서 지정된 key값으로 저장된 Entry를 삭제하고, 해당 value를 반환한다.
		 * 	- 지정된 key값에 해당하는 정보가 존재하지 않으면 null이 반환
		 */
		map.remove("addr");
		map.remove("fax");
		
		System.out.println(map);
	}
}