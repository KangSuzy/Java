
public class AdderTest {
	public static void main(String arg[]) {
		Adder adder = new Adder();
		
		int res1 = adder.sum(10, 20);
		double res2 = adder.sum(20.3, 2.4);
		int res3 = adder.sum(110, 20, 30);
		double res4 = adder.sum(10, 20.0, 30, 40.0);
		
		System.out.println("res"+res1);
		System.out.println("res"+res2);
		System.out.println("res"+res3);
		System.out.println("res"+res4);
	}
}
