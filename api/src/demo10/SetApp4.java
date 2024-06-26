package demo10;

import java.util.HashSet;

public class SetApp4 {

	public static void main(String[] args) {
		
		/*
		 * 사원정보를 여러개 저장하기
		 */
		
		HashSet<Employee> employees = new HashSet<Employee>();
		
		Employee emp1 = new Employee(100, "홍길동", "영업팀", 500);
		Employee emp2 = new Employee(101, "김유신", "홍보팀", 300);
		Employee emp3 = new Employee(102, "강감찬", "기술팀", 700);
		Employee emp4 = new Employee(102, "강감찬", "기술팀", 700);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
		int size = employees.size();
		System.out.println("size: " + size);
		
		for(Employee emp : employees) {
			System.out.print("직원번호:" + emp.getNo());
			System.out.print(" 직원이름:" + emp.getName());
			System.out.print(" 부서명:" + emp.getDept());
			System.out.print(" 월급:" + emp.getSalary() + "\n");
		}
	}
}