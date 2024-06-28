package demo13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorApp1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		set.add("류관순");
		
		// 향상된 for문을 사용해서 반복처리하기
		for (String value : set) {
			System.out.println(value);
		}
		
		System.out.println(set);
		System.out.println();
		
		// Iterator를 사용해서 반복처리하기
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String value = iter.next();
			if(iter.equals("이순신")) {
				iter.remove();
			}
			System.out.println(value);
		}
		
		System.out.println(set);
	}
}