package testex;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String[] sp = a.split(" ");
		
		for (String sps : sp) {
			System.out.println(sps);
			
		}
		System.out.println(sp.length);
		
	}

}
