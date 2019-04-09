class FruitSellerTest{
	int apple;
	int sales;
}

public class FruitSellerTest{
	public static void main(String[] args) {
		FruitSeller s1 = new FruitSeller();
		s1.apple = 20;
		s1.sales = 0;
		System.out.println("사과개수: " + s1.apple + "판매수익: " + s1.sales);

		FruitSeller s2 = new FruitSeller();
		s2.apple = 50;
		s2.sales = 10000;
		System.out.println("사과개수: " + s2.apple + "판매수익: " + s2.sales);
	}
}