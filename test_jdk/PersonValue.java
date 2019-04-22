

public class PersonValue {
	public String name;
	public int age;
	public PersonValue(String s) {
		name = s;
	}
	public void setAge(MyInt i) {
		age = i.val;
		i.val++;
	}
}
