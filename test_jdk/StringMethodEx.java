package javatest;

public class StringMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a.concat(b));
		System.out.println(a.trim());
		System.out.println(a.replace(" C#", " JAVA"));
		String s[] = a.split(",");
		
		System.out.println( a.substring(5));
		char c = a.charAt(2);
		System.out.println(c);
	}

}
