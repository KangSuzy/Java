
public class Box {
	int width;
	int length;
	int height;
	

	public void print() {
		System.out.print("������ ���ο� ���ο� ���̴�" + width + length + height);
	}
	
	int getVolume() {
		int volume = width*height*length;
		return volume;
	}
}
