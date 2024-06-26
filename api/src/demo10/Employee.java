package demo10;

import java.util.Objects;

/*
 * Comparable<T>
 *  - 인터페이스를 구현한 객체는 정렬가능한 객체가 된다.
 *  - 인터페이스는 int compareTo(T other) 추상메소드가 있다.
 *  - 구현클래스에서는 compareTo 메소드를 재정의해야 한다.
 *  - 다른 객체가 더 크면 음수, 같으면 0, 다른 객체가 더 작으면 양수가 반환되도록 구현해야 한다.
 *  - 정렬기준이 되는 값은 객체의 값 중에서 아무거나 상관없다.(2개 이상 가능)
 */
public class Employee implements Comparable<Employee> {

	private int no;
	private String name;
	private String dept;
	private int salary;
	
	public Employee() {}

	public Employee(int no, String name, String dept, int salary) {
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return no == other.no;
	}
	
	@Override
	public int compareTo(Employee other) {
		return this.no - other.no;
	}
}