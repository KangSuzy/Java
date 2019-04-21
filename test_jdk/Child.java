
public class Child {
	int numOfBall;

	public void obtainBall(Child child, int obtain) {
		int obtainCount= child.loseBall(obtain);
		numOfBall += obtainCount;
	}
	public int loseBall(int loseCount){
		if(numOfBall < loseCount) {
			int retValue = numOfBall;
			numOfBall = 0;
			return retValue;
		}
		numOfBall -= loseCount;
		return loseCount;
	}
	
	public void Show() {
		System.out.println("가진 구슬의 수는 "+numOfBall);
	}
	
}
