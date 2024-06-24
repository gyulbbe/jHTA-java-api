package demo5;

public class WrapperApp2 {

	public static void main(String[] args) {
		
		Double a = new Double(3.14);
		Double b = new Double("3.14");
		Double c = Double.valueOf(3.14);
		Double d = Double.valueOf("3.14");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}