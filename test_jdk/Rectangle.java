
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		point p1;
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		p1 = new point(x, y);
		int around = (x+y)*2;
		int area = x*y;
				
		
		p1.print();
		p1.show(x, y);
		System.out.print("�簢�� �ѷ���" + around + "�簢�� ����"+area);
		
	}

}
