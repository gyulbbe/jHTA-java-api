package demo13;

import java.util.Iterator;
import java.util.List;

public class IteratorApp2 {

	public static void main(String[] args) {
		
		List<String> list = List.of("홍길동", "김유신", "강감찬", "이순신");
		
		// 일반 for문을 이용한 반복처리
		int size = list.size();
		for (int i = 0; i < size; i++) {
			String value = list.get(i);
			System.out.println(value);
		}
		
		System.out.println();
		
		// 향상된 for문을 이용한 반복처리
		for (String value : list) {
			System.out.println(value);
		}
		
		System.out.println();
		
		// Iterator를 이용한 반복처리
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String value = iter.next();
			System.out.println(value);
		}
	}
}