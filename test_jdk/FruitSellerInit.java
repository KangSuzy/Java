package javatest;

public class FruitSellerInit{
	private int numOfApple;
	private int appleUnitCost;
	private int money = 0;
	
	public void FruitSeller(int numOfApple, int appleUnitCost) {
		    this.numOfApple = numOfApple;
		    this.appleUnitCost = appleUnitCost;
		    
	}
	
	public int saleApple(int money) {
		int num = money / this.appleUnitCost;
		this.numOfApple -= num;
		this.money += money;
		return num;
	}
	
	public void showResult() {
		System.out.println("���� ��� "+numOfApple );
		System.out.println("�Ǹż��� "+money);
		}
}