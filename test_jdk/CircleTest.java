class Circle{
 	int r;
 	final double PI = 3.14;
}
public class CircleTest{
	public static void main(String args[]){
	Circle c1 = new Circle();
	c1.r = 10;
	System.out.println("c1�� �ѷ�: " + c1.r*2*c1.PI + "c1�� ����:" + c1.r*c1.r*c1.PI);
	
	Circle c2 = new Circle();
	c2.r = 20;
	System.out.println("c2�� �ѷ�: " + c2.r*2*c2.PI + "c2�� ����:" + c2.r*c2.r*c2.PI);
	}
}