package finaltest;

import java.util.Scanner;

public class ArithemticExceptionEx {
	public static void main(String args[]) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("�������� �Է��ϼ���: ");
		dividend = rd.nextInt();
		System.out.print("���� ���ڸ� �Է��ϼ��� : ");
		divisor = rd.nextInt();
		try {
			System.out.println(dividend+" �� "+divisor+"�� ������ ���� "
					+dividend/divisor+"�Դϴ�");
		}
		catch(ArithmeticException e){//ArithmeticException ����ó�����
			System.out.println("0���� �������� ~");
		}
	}
		
	
}
