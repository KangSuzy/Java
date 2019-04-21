
public class Student {
	private int number;
	private String name;
	private int age;
	
	Student(){
		number = 2017;
		name="°­¼öÁö";
		age =24;
	}
	Student(int number, String name, int age){
		this.number = number;
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println("Studnet [number"+ number + ", name= "+ name +", age="+age+"]");
	}
}
