package demo1;

import java.util.Objects;

/*
 * Cloneable
 * - 마크업 인터페이스다.
 *   (추상화된 메소드가 하나도 없는 인터페이스다.)
 * - 추상화된 메소드가 하나도 없는 인터페이스다.
 * - 마크업 인터페이스는 특정 객체가 무엇, 무엇이 가능하다는 여부를 표시하기 위해서 사용되는 인터페이스다.
 * - Cloneable 인터페이스는 해당 객체가 복제가능하다는 것을 표시하는 마크업 인터페이스다.
 */
public class Student implements Cloneable{

	int no ;
	String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public Student copy() throws CloneNotSupportedException {
		/*
		 * Object clone() 메소드
		 *  - Object에 정의된 메소드다.
		 *  - 이 객체의 복제본 객체를 생성해서 반환한다.
		 *  - 반환타입의 Object다.
		 */
		return (Student) clone();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}

	/*
	 * Object의 equals(Object obj)와 hashCode() 메소드를 재정의한다.
	 * 
	 * Object의 equals(Object obj) 메소드 재정의하기
	 *  - Object의 equals(Object obj) 메소드는 객체의 동일성을 비교한다.
	 *    이 객체와 다른 객체가 완전히같은 객체일 때만 true를 반환한다.
	 *  - Student와 같이 값을 표현하는 객체에서는 equals(Object obj) 메소드가 객체의 동등성을 비교하도록 재정의하자.
	 *  - 이 객체와 다른 객체가 서로 다른 객체이기는 하지만 객체가 가지고 있는 값이 서로 같은 값을 가지고 있으면 같은 객체로 판단하도록 하는 것이 동등성 비교다.
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return no == other.no;
	}
	
	/*
	 * Object의 toString() 메소드 재정의하기
	 *  - Object의 toString() 메소드는 객체에 대한 간단한 정보를 문자열로 제공하는데, 우리가 정의한 클래스에서는 별로 유용하지 않다.
	 *  - 만약, 클래스가 값을 표현하는 객체를 생성할 목적으로 정의된 것이라면 객체의 멤버변수에 어떤 값이 대입되어 있는지를 알아내는 것이 더 중요하다.
	 *  - toString() 메소드를 재정의해서 멤버변수명과 해당 변수에 저장된 값을 문자열로 만들어 반환하도록 한다.
	 */
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
}