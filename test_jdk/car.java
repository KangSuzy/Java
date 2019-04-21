
public class car {
	String color;
	int speed;
	int gear;
	
	void changeGear(int g) {
		gear = g;
	}
	
	void speedUp() {
		speed = speed +10;
	}
	
	void speedDown() {
		speed = speed - 10;
	}
	
	void changeColor(String c) {
		color = c;
	}

}
