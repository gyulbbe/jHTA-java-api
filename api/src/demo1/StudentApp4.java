package demo1;

public class StudentApp4 {

	public static void main(String[] args) throws Exception {

		Student s1 = new Student(10, "김유신");
		
		Student s2 = s1.copy();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
	}
} 