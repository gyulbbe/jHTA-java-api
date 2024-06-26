package demo10;

import java.util.HashSet;

public class SetApp1 {

	public static void main(String[] args) {
		
		/*
		 * HashSet<E>
		 *  - Set<E> 인터페이스의 구현클래스다.
		 *  - 중복을 혀용하지 않는다.
		 *  - 해시코드값을 이용해서 객체의 중복여부를 체크한다.
		 *  - 주요 API
		 *  	boolean add(E e)
		 *  		객체에 저장한다.
		 *  		저장에 성공하면 true를 반환한다.
		 *  		만약 동일한 객체가 있어서 저장에 실패했으면 false를 반환한다.
		 *  			실제 개발환경에서 반환값은 신경쓰지 않는다.
		 *  	void addAll(Collection c)
		 *  		전달받은 콜렉션에 저장된 모든 객체를 한번에 저장한다.
		 *  	boolean contains(Object e)
		 *  		저장된 객체가 존재하면 true를 반환한다.
		 *  	void clear()
		 *  		저장된 모든 객체를 삭제한다.
		 *  	int size()
		 *  		저장된 객체의 갯수를 반환한다.
		 *  	boolean isEmpty()
		 *  		저장된 객체가 하나도 없을 때 true를 반환한다.
		 *  		자료구조에 저장된 객체를 표현할 때 상항 empty 여부를 체크한다.
		 *  	boolean remove(Object e)
		 *  		저장된 객체를 삭제한다.
		 *  	Iterator<E> iterator()
		 *  		저장된 객체를 반복처리하는 Iterator 객체를 반환한다.
		 */
		
		// 중복을 허용하지 않는 자료구조 구현객체 생성하기
		HashSet<String> names = new HashSet<String>();
		
		// 객체 저장하기
		names.add("이순신");
		names.add("김유신");
		names.add("류관순");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		
		// 저장된 객체 전부 삭제하기
		names.clear();
		
		// 저장된 객체의 갯수 조회하기
		int size = names.size();
		System.out.println("저장된 객체의 갯수: " + size);
		
		// 저장된 객체 조회하기
		for(String name : names) {
			System.out.println(name);
		}
	}
}