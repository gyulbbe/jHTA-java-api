package demo11;

import java.util.Stack;

public class ListApp4 {

	public static void main(String[] args) {
		
		/*
		 * Stack<E>
		 *  - 후입선출(LIFO)
		 *  - 주요 API
		 */
		
		Stack<String> names = new Stack<String>();
		
		names.push("김유신");
		names.push("강감찬");
		names.add("김구");
		System.out.println(names);

		names.pop();
		System.out.println(names);
		
		names.add("류관순");
		System.out.println(names);
		
		names.pop();
		System.out.println(names);
	}
}
