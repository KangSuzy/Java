
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int time;
		
		for(dan=2;dan<10;dan++) {
			for(time=1;time<10;time++) {
				System.out.println(dan + "X" + time + "=" + dan*time);
			}

			System.out.println();
		}
	}

}
