
public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String medal = "Gold";
		
		switch (medal) {
		
		case "Gold":
			System.out.println("금메달 !");
			break;
		case "Silver":
			System.out.println("은메달 !");
			break;
		case "Bronze":
			System.out.println("동메달 !");
			break;
		default:
			System.out.println("메달이 없꾸나,,");
			break;
		}
	}

}
