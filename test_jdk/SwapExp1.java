
class Point1{
	int x, y;
}

public class SwapExp1 {
	
	static void swap(int n1, int n2) {
		int temp;
		temp = n1;
		n2 = n1;
		n1 = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1 p = new Point1();
		p.x = 20;
		p.y = 50;
		
		swap(p.x, p.y);
		
		
		System.out.println(p.x + ","+p.y);
	}
}
