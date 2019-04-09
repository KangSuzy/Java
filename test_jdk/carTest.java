
public class carTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car myCar = new car();
		
		myCar.changeGear(1);
		myCar.speedUp();
		myCar.changeColor("Yellow");
		
		System.out.println("myCar의 속도"+myCar.speed);
		System.out.println("myCar의 기어"+myCar.gear);
		System.out.println("myCar의 색상"+myCar.color);
		
	}

}
