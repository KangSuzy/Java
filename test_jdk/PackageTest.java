package javatest;

import java.util.Scanner;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer age = Integer.valueOf(10);
		int showage = age.intValue();
		System.out.println(showage); //wrapper view basic types
		
		String s1 = "Hello"; // can't use  == 
		String s2 = new String("HelloWorld"); //created at heap == use is fine
		if (s1.equals(s2)) {
			System.out.println("Same!");
		}
		else {
			System.out.println("Different!");
		}
	}

}
