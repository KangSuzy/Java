class FruitSeller{
	static final int APPLE_UNICOST = 1000;
	int numofApple;
	int money;

	public void buyApple(FruitSeller s, int money){
	numofApple = numofApple - s.numofApple;
	money = money-APPLE_UNICOST*s.numofApple;
	}

	public void showResult(){
	System.out.println("사과 개수"+numofApple +"판매수익"+money);
	}
}

public class FruitBuyer{
	public static void main(String[] args){

	FruitSeller s = new FruitSeller();
	s.numofApple = 0;
	s.money = 5000;
	//s.buyApple();
	s.showResult();
	}
}