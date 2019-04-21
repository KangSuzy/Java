
import java.util.Scanner;
public class CarNewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CarNew c1, c2,c3;
		
		String color = sc.next();
		int speed = sc.nextInt();
		int gear = sc.nextInt();
		c1 = new CarNew(color, speed, gear);
		
		color = sc.next();
		speed = sc.nextInt();
		gear = sc.nextInt();
		c2 = new CarNew(color, speed, gear);
		
		color = sc.next();
		speed = sc.nextInt();
		gear = sc.nextInt();
		c3 = new CarNew(color, speed, gear);
		
		int n = CarNew.getNumberOfCars();
		
		c1.print();
		c2.print();
		c3.print();
		System.out.print(n);
	}

}
