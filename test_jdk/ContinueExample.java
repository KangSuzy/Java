
public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int num;
		
		for (num=0;num<=100;num++) {
			
			if(num%2 == 0) 
				continue;
			total += num;
			
		}
		System.out.println("1부터 100까지 홀수의 합은 "+total);
	}

}
