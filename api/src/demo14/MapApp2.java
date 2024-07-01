package demo14;

import java.util.HashMap;
import java.util.Map;

public class MapApp2 {

	public static void main(String[] args) {
		
		String text = "Returns the same value as the nextToken method, except that its declared return value is Object rather than String. It exists so that this class can implement the Enumeration interface.";
		
		Map<Character, Integer> map = new HashMap<Character, Integer> ();
		
		text = text.toLowerCase();
		
		int len = text.length();
		for(int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			
			boolean isExist = map.containsKey(ch);
			if(isExist) {
				// 글자가 이미 Map에 있다.
				int count = map.get(ch);
				map.put(ch, count + 1);
			} else {
				//글자가 아직 Map에 없다.
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
	}
}