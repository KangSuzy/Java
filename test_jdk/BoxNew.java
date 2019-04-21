
public class BoxNew {

	private int width;
	private int length;
	private int height;
	
	BoxNew(int width, int length, int height){
		this.width=width;
		this.length=length;
		this.height=height;
	}
	
	void print() {
		System.out.println("상자의 기로" + width);
		System.out.println("상자의 세로" + height);
		System.out.println("상자의 높이" + length);
	}
	
	int getVolume() {
		int volume = width * length * height;
		
		return volume;
	}
}
