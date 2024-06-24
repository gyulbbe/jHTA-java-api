package demo5;

public class NumberUtilsApp {

	public static void main(String[] args) {
		
		System.out.println(NumberUtils.toInt(null));
		System.out.println(NumberUtils.toInt(""));
		System.out.println(NumberUtils.toInt("   "));
		System.out.println(NumberUtils.toInt("가나다"));
		System.out.println(NumberUtils.toInt("가100"));
		System.out.println(NumberUtils.toInt(" 100"));
		System.out.println(NumberUtils.toInt("-100"));
		System.out.println(NumberUtils.toInt("+100"));
		System.out.println(NumberUtils.toInt("100"));
		
		System.out.println();
		
		System.out.println(NumberUtils.toInt(null, 1));
		System.out.println(NumberUtils.toInt("", 1));
		System.out.println(NumberUtils.toInt("   ", 1));
		System.out.println(NumberUtils.toInt("가나다", 1));
		System.out.println(NumberUtils.toInt("가100", 1));
		System.out.println(NumberUtils.toInt(" 100", 1));
		System.out.println(NumberUtils.toInt("-100", 1));
		System.out.println(NumberUtils.toInt("+100", 1));
		System.out.println(NumberUtils.toInt("100", 1));
	}
}
