
class Fruit{
	int numOfApple;
	int money;
	final int AppleSales = 1000;
	
	int salesApple (int m){
		int num = m/AppleSales;
		numOfApple -= num;
		money += num*AppleSales;
		return money;
	}
	int buyApple (int n) {
		int num = n/ AppleSales;
		numOfApple += num;
		money -= num*AppleSales;
		return money;
	}
	void showResult() {
		System.out.println("현재 사과 개수: "+numOfApple);
		System.out.println("현재 돈: "+money);
	}
}

public class FruitSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruitseller = new Fruit();
		fruitseller.numOfApple =20;
		fruitseller.money = 0;
		fruitseller.salesApple(2000);
		fruitseller.showResult();
	}
}
