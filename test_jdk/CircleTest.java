class Circle{
 	int r;
 	final double PI = 3.14;
}
public class CircleTest{
	public static void main(String args[]){
	Circle c1 = new Circle();
	c1.r = 10;
	System.out.println("c1의 둘레: " + c1.r*2*c1.PI + "c1의 넓이:" + c1.r*c1.r*c1.PI);
	
	Circle c2 = new Circle();
	c2.r = 20;
	System.out.println("c2의 둘레: " + c2.r*2*c2.PI + "c2의 넓이:" + c2.r*c2.r*c2.PI);
	}
}