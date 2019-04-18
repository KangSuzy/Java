package test;
class EX{
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public static void f() {
		m = 5;
	}
}

public class StaticSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EX s1, s2;
		s1 = new EX();
		s1.n = 5;
		s1.g();
		s1.m = 50;
		
		s2  = new EX();
		s2.n=8;
		s2.h();
		s2.f();
		System.out.print(s1.m);

	}

}
