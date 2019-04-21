
public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child1 = new Child();
		Child child2 = new Child();
		child1.numOfBall = 15;
		child2.numOfBall = 9;
		
		System.out.println("게임전 구슬 개수");
		System.out.println("어린이 1 ");
		child1.Show();
		System.out.println("어린이 2 ");
		child2.Show();
		
		child1.obtainBall(child2, 2);
		child2.obtainBall(child1, 7);
		
		System.out.println("게임후 구슬 개수");
		System.out.println("어린이 1 ");
		child1.Show();
		System.out.println("어린이 2 ");
		child2.Show();
		
		
		
		
	}

}
