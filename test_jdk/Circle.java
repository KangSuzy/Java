import java.util.Scanner;
public class Circle{
	public static void main(String[] args){
		int radius;
		double PL = 3.14;
		Scanner input = new Scanner(System.in);	
		System.out.println("반지름을 입력하세요");
		radius = input.nextInt();
		if (radius == 0){
			System.out.printf("0보다 큰 수를 입력하세요");}
		else{
			System.out.printf("원의 면적 %f", PL*radius*radius);
		}
	}
}


			