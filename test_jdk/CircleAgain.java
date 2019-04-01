class Circle {
 
    int radius;
 
    public Circle(int radius) {
        this.radius = radius;
    }

    public double Area() {
        return radius * radius * Math.PI;
    }

    public double Round() {
        return radius * 2 * Math.PI;
    }
}
public class CircleAgain{



       	public static void main(String args[]){
		Circle c1 = new Circle();
		System.out.println(c1.Round(10)+ c1.Area(10));
		Circle c2 = new Circle();
		System.out.println(c2.Round(20)+ c2.Area(20));
	
		
        }
}
