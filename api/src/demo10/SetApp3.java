package demo10;

import java.util.Random;
import java.util.TreeSet;

public class SetApp3 {

	public static void main(String[] args) {
		
		/*
		 * Set<E> 구현 클래스의 특성을 이용한 로또번호 생성프로그램
		 * 1. 임의의 난수를 발생한다.
		 * 2. 획득된 난수를 Set<E> 구현객체에 저장한다.
		 * 3. Set<E> 구현객체에 저장된 갯수가 6개가 되면 출력한다.
		 */
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		Random random = new Random();
		
		while(true) {
			int number = random.nextInt(45) + 1;
			lotto.add(number);
			
			if(lotto.size() == 6) {
				break;
			}
		}
		
		for(int num : lotto) {
			System.out.print(num + "	");
		}
	}
}