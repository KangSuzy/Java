package finaltest;

import java.util.Scanner;

public class ArithemticExceptionEx {
	public static void main(String args[]) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("나뉨수를 입력하세요: ");
		dividend = rd.nextInt();
		System.out.print("나눌 숫자를 입력하세요 : ");
		divisor = rd.nextInt();
		try {
			System.out.println(dividend+" 를 "+divisor+"로 나누면 몫은 "
					+dividend/divisor+"입니다");
		}
		catch(ArithmeticException e){//ArithmeticException 에외처리블록
			System.out.println("0으로 못나눠요 ~");
		}
	}
		
	
}
