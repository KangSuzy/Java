
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		tv.channel=7;
		tv.volume=9;
		tv.onOff=true;
		
		Television yourTV = new Television();
		yourTV.channel=27;
		yourTV.volume=29;
		yourTV.onOff=true;
		
		tv.print();
		yourTV.print();
	}

}
