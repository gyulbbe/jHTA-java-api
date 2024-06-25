package demo8;

public class MathApp2 {

	public static void main(String[] args) {
		
		//반올림값을 반환
		long value1 = Math.round(1.0);
		long value2 = Math.round(1.2);
		long value3 = Math.round(1.6);
		long value4 = Math.round(1.9);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		double value11 = Math.ceil(1.0);
		double value12 = Math.ceil(1.2);
		double value13 = Math.ceil(1.6);
		double value14 = Math.ceil(1.9);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		System.out.println(value14);
		System.out.println();
		
		double value21 = Math.floor(1.0);
		double value22 = Math.floor(1.2);
		double value23 = Math.floor(1.6);
		double value24 = Math.floor(1.9);
		System.out.println(value21);
		System.out.println(value22);
		System.out.println(value23);
		System.out.println(value24);
		System.out.println();
	}
}