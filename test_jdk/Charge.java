
public class Charge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 22;
		int charge;
		
		if (age<8) {
			charge = 1000;
			System.out.println("아동입니다 !");
		}else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다 !");
		}else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다 !");
		}else {
			charge = 3000;
			System.out.println("어머나 성인이네요!");
		}
		System.out.println("입장료는 "+charge+"원 입니다");
	}

}
