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

                System.out.printf("�ʱ� ����� ������ " + s1.numofApple + " �Ǹż����� " + s1.money);
                System.out.printf("�ʱ� ����� ������ " + s2.numofApple + " �Ǹż����� " + s2.money);                
        }
}