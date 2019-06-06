package Inheritance;
 
class Calculator2 {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
	//class SubstractionableCalculator extends Calculator2 {
	 //   public void substract() {
	//        System.out.println(this.left - this.right);
	//    }
    
    class MultiplicationableCalculator extends Calculator2 {
        public void multiplication() {
            System.out.println(this.left * this.right);
        }
        

}
 
public class CalculatorChild {

        public static void main(String[] args) {
        	
        	//SubstractionableCalculator s1  = new SubstractionableCalculator();
        	//s1.setOprands(10, 20);
            //s1.sum();
            //s1.avg();
        	//s1.substract();
        	
            MultiplicationableCalculator c1 = new MultiplicationableCalculator();
            c1.setOprands(10, 20);
            c1.sum();
            c1.avg();
            c1.multiplication();
        }
 
	}
