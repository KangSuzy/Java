
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox = new Box();
		mybox.width = 20;
		mybox.height = 30;
		mybox.length= 30;

		mybox.print();
		
		int volume = mybox.getVolume();
		System.out.println("박스의 부피"+ volume);
	}

}
