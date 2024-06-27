package demo11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ListApp2 {

	public static void main(String[] args) {
		
		HashSet<String> names1 = new HashSet<String>();
		names1.add("홍길동");
		names1.add("김유신");
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("강감찬");
		// 다른 자료구조에 저장된 객체를 한번에 저장
		names2.addAll(names1);
		System.out.println(names2); //[강감찬, 홍길동, 김유신]
		
		// 리스트의 0번째에 객체 저장하기
		names2.add(0, "류관순");
		System.out.println(names2); //[류관순, 강감찬, 홍길동, 김유신]
		
		// 리스트의 1번째 객체를 다른 값으로 교체
		names2.set(1, "세종대왕");
		System.out.println(names2); //[류관순, 세종대왕, 홍길동, 김유신]
		
		// 리스트의 2번째 객체를 삭제하기
		names2.remove(2);
		System.out.println(names2); //[류관순, 세종대왕, 김유신]
		
		// 리스트 복제
		// clone() 메소드는 반환타입이 Object라서 형변환이 필요
		@SuppressWarnings("unchecked")
		List<String> clonedList = (List<String>)names2.clone();
		System.out.println(clonedList);
		
		// 오름차순 정렬
		clonedList.sort(Comparator.naturalOrder());
		System.out.println(clonedList);
		
		// 내림차순 정렬
		clonedList.sort(Comparator.reverseOrder());
		System.out.println(clonedList);
	}
}