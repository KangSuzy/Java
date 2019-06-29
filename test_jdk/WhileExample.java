
public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		
		while(num < 11) {
			sum += num;
			num++;		
		}
		
		System.out.println("1부터 10까지의 합은 "+sum);
	}

}
