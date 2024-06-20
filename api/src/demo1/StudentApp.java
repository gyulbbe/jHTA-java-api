package demo1;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student(10, "홍길동");
		Student s2 = new Student(10, "홍길동");
		Student s3 = new Student(20, "김유신");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}