import java.util.Scanner;
public class FindYear {
	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		int findyear = sc.nextInt();
		if ((findyear % 4 == 0 && findyear % 100 != 0) || findyear % 400 == 0) {
			System.out.println(findyear + "���� ����");
		} else {
			System.out.println(findyear + "���� ���");
		}
	}
}