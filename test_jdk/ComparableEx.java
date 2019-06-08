package test;

class Circle implements Comparable<Circle>{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}


@Override
public int compareTo(Circle other) {
	if(this.radius > other.radius) return 1;
	else if (this.radius == other.radius) return 0;
	else return -1;
	}
}
public class ComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		
		int comp = c1.compareTo(c2);
		if(comp < 0)
			System.out.print("C1 < C2");
		else if (comp == 0)
			System.out.println("C1 == C2");
		else
			System.out.println("C1 > C2");
		}

}
