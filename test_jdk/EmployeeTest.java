
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1, e2, e3;
		
		e1 = new Employee("강수지", 35000);
		e2 = new Employee("수지", 45000);
		e3 = new Employee("지", 55000);
		
		int n = Employee.getCount();
		System.out.println("현재 직원수 "+n);
		 
		
	}

}
