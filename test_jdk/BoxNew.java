
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
		System.out.println("������ ���" + width);
		System.out.println("������ ����" + height);
		System.out.println("������ ����" + length);
	}
	
	int getVolume() {
		int volume = width * length * height;
		
		return volume;
	}
}
