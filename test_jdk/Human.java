
public class Human {
	String name;
	int age;
	double height;
	double weight;
	
	public Human(String n, int a, double h, double w){
		name = n;
		age = a;
		height = h;
		weight = w;
		System.out.println("�̸�/ ����/ Ű/ ������\n" +
		name+" / " + age +" / " + height+" / " +weight);
	}
	
	String getName() {return name;}
	int getAge() {return age;}
	double getHeight() {return height;}
	double getWeight() {return weight;}
}
