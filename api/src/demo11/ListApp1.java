package demo11;

import java.util.ArrayList;
import java.util.List;

public class ListApp1 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();

		// 객체 저장하기
		names.add("이순신");
		names.add("홍길동");
		names.add("강감찬");
		names.add("류관순");
		names.add("안중근");
		names.add("김구");
		names.add("윤봉길");
		names.add("김유신");
		names.add("김유신");
		names.add("김유신");
		names.add("김유신");
		names.add("김유신");
		names.add("김유신");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
		
		int size = names.size();
//		for (int i = 0; i < names.size(); i++) { <- size란 메소드를 13번을 써야되기 때문에 이렇게 적는 것을 지양하자
		for (int i = 0; i < size; i++) {
			String value = names.get(i);
			System.out.println(value);
		}
		
		
	}
}