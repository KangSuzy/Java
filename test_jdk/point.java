

public class point {
	private int x;
	private int y;
	
	point(int x, int y){
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.println("����" + x);
		System.out.println("����" + y);
	}
	
	public void show(int x, int y) {
		System.out.print("("+ x +" ," + y+")");
		
	}
}
