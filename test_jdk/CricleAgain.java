import java.util.Scanner;
public class CircleAgain{
        public static void main(String[] args){
                double radius;
                final double PL = 3.14;
                Scanner input = new Scanner(System.in);        
                System.out.println("�������� �Է��ϼ���");
                radius = input.nextFloat();
		while (true){
                if (radius < 0 ){
                        System.out.printf("0���� ū ���� �Է��ϼ���");
		break;}
                else{
                        System.out.printf("���� ���� %f", PL*radius*radius);
                }
        }
}
}