import java.util.Scanner;
public class Circle{
	public static void main(String[] args){
		int radius;
		double PL = 3.14;
		Scanner input = new Scanner(System.in);	
		System.out.println("�������� �Է��ϼ���");
		radius = input.nextInt();
		if (radius == 0){
			System.out.printf("0���� ū ���� �Է��ϼ���");}
		else{
			System.out.printf("���� ���� %f", PL*radius*radius);
		}
	}
}


			