
public class Box {
	int width;
	int length;
	int height;
	

	public void print() {
		System.out.print("상자의 가로와 세로와 높이는" + width + length + height);
	}
	
	int getVolume() {
		int volume = width*height*length;
		return volume;
	}
}
