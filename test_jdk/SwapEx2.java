
class Point{
	int x,y;
}

public class SwapEx2 {
	static void swap(Point val) {
		int temp;
		temp = val.x;
		val.x = val.y;
		val.y = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p= new Point();
		p.x = 20;
		p.y = 50;
		
		swap(p);
		
		System.out.println(p.x+","+p.y);
	}
}
