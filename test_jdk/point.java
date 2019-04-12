

public class point {
	private int x;
	private int y;
	
	point(int x, int y){
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.println("가로" + x);
		System.out.println("세로" + y);
	}
	
	public void show(int x, int y) {
		System.out.print("("+ x +" ," + y+")");
		
	}
}
