class Circle{
	double radius;
	double round;
	double area;
	final double PI = 3.14;

        public void setRadius(double r){
                this.radius = radius;
        }
        public double getRadius(){
                return radius;
        }
        public void setRound(double round){
                this.round = round;
        }
        public double getRound(){
                return radius*2*PI;
        }
        public void setArea(double area){
                this.area = area;
        }
        public double getArea(){
                return radius*radius*PI;
        }


}
public class CircleAgain{

        public static void main(String args[]){
        Circle c1 = new Circle();
        c1.setRadius(10);
        System.out.println("c1�� �ѷ�: " + c1.getRound() + " c1�� ����:" + c1.getArea());
        
        Circle c2 = new Circle();
        c2.setRadius(20);
        System.out.println("c2�� �ѷ�: " + c2.getRound() + " c2�� ����:" + c2.getArea());
        }
}
