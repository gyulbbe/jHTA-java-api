package demo9;

public class BoxApp1 {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.save("홍길동");
		String value = box1.get();
		System.out.println(value);
		
//		Box<int> box2 = new Box<>(); <- 기본자료형타입은 제네릭의 타입으로 지정할 수 없다.
		Box<Integer> box2 = new Box<>();
		box2.save(100); // 자동박싱
		int value2 = box2.get(); // 자동 언박싱
		System.out.println(value2);
	}
}