package demo9;

import demo9.phone.FeaturePhone;
import demo9.phone.Phone;
import demo9.phone.SmartPhone;

public class PhoneBoxApp1 {

	public static void main(String[] args) {
		
		PhoneBox<Phone> box1 = new PhoneBox<Phone>();
		box1.save(new Phone());
		box1.save(new SmartPhone());
		box1.save(new FeaturePhone());
		
		PhoneBox<SmartPhone> box2 = new PhoneBox<SmartPhone>();
//		box2.save(new Phone()); <- 컴파일 오류
		box2.save(new SmartPhone());
//		box2.save(new FeaturePhone()); <- 컴파일 오류
		
		PhoneBox<FeaturePhone> box3 = new PhoneBox<FeaturePhone>();
		
//		제네릭의 타입은 Phone 혹은 Phone의 하위만 가능하다.
//		PhoneBox<String> box2 = new PhoneBox<String>();
//		PhoneBox<Integer> box3 = new PhoneBox<Integer>();
	}
}