package demo14;

import java.util.HashMap;
import java.util.Map;

public class MapApp3 {

	public static void main(String[] args) {
		
		// 고객등급과 포인트 적립률을 저장하는 HashMap객체 생성하기
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("GOLD", 0.05);
		map.put("SILVER", 0.02);
		map.put("BRONZE", 0.01);
		
		String grade = "GOLD";
		int orderPrice = 1000000;
		
		int depositPoint = (int)(orderPrice * map.get(grade));
		System.out.println(depositPoint);
	}
}