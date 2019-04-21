
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
		System.out.println("����" + color);
		System.out.println("�ӵ�" + speed);
		System.out.println("���" + gear);
	}
	
	public static int getNumberOfCars() {
		return numbers;
	}

}
