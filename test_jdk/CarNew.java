
public class CarNew {
	private String color;
	private int speed;
	private int gear;
	private int id;
	private static int numbers = 0;
	
	CarNew(String color, int speed, int gear){
		this.color = color;
		this.speed = speed;
		this.gear = gear;
		id=++numbers;
	}
	void print() {
		System.out.println("색깔" + color);
		System.out.println("속도" + speed);
		System.out.println("기어" + gear);
	}
	
	public static int getNumberOfCars() {
		return numbers;
	}

}
