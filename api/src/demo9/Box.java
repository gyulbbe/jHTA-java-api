package demo9;

/*
 * Box는 제네릭 클래스다.
 * 
 * Box 멤버변수의 타입은 구체적인 타입이 아니다.
 * Box save() 메소드의 매개변수 타입은 구체적인 타입이 아니다.
 * Box get() 메소드의 매개변수 타입은 구체적인 타입이 아니다.
 */
public class Box<T> {

	//제네릭타입의 배열은 선언할 수 없음
	//private T[] data = new T[10];
	
	private T t;
	
	public void save(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	
}