import java.util.Scanner;
public class CircleAgain{
        public static void main(String[] args){
                int radius;
                double PL = 3.14;
                Scanner input = new Scanner(System.in);        
                
		while(true){
                      System.out.println("�������� �Է��ϼ���");
                	radius = input.nextInt(); 
                if (radius == 0){
                        System.out.println("0���� ū ���� �Է��ϼ���");
			break;}
                else{
 
			System.out.printf("���� ���� %f", PL*radius*radius);
                }
	}
        }
}
