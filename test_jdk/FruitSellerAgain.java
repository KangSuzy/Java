public class FruitSellerAgain{
        int numofApple;
        int money;

        public void setNumofApple(int numofApple){
                this.numofApple = numofApple;
        }

        public void setMoney(int money){
                this.money = money;
        }

        
        public static void main(String[] args){
                FruitSellerAgain s1 = new FruitSellerAgain();
                s1.setNumofApple(20);
                s1.setMoney(0);

                FruitSellerAgain s2 = new FruitSellerAgain();
                s2.setNumofApple(50);
                s2.setMoney(10000);

                System.out.printf("초기 사과의 갯수는 " + s1.numofApple + " 판매수익은 " + s1.money);
                System.out.printf("초기 사과의 갯수는 " + s2.numofApple + " 판매수익은 " + s2.money);                
        }
}