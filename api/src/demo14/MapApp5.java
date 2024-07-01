package demo14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapApp5 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 30);
		map.put("김유신", 60);
		map.put("이순신", 50);
		map.put("류관순", 20);
		
		/*
		 * Map.Entry<K, V>
		 *  Map객체 저장된 key, value 쌍을 표현한다.
		 *  Map객체는 여러 개의 Entry객체를 저장할 수 있다.
		 *  Map객체에 저장된 Entry객체는 중복되지 않는다.
		 *  Map객체의 entrySet()메소드를 실행하면 Map객체에 저장된 모든 Entry객체를 Set객체에 담아서 반환한다.
		 */
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " " + value);
		}
	}
}