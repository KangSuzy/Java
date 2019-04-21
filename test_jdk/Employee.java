
public class Employee {
	private String name;
	private double salary;
	private static int count = 0; //정적변수
	
	public Employee(String n, double s) {
		name = n;
		salary =s;
		count++; //정적 변수인 count를 증가
	}
	
	public static int getCount() {
		return count; //정적 method라서 Employee.getCount()로 접근가능
	}
}
