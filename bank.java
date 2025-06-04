class withdrawal extends Thread{
    static int balance =1000;
    int debited ;

    withdrawal(int debited){
        this.debited =debited;
       
    }
      
     public void run(){
        synchronized(withdrawal.class){
        if(balance>=debited){
            System.out.println("the amount which is debited is: " +debited);
            balance-=debited;
            try{
                Thread.sleep(1000);
            }catch (Exception e){}

            System.out.println( "the remaining amount is :"+balance);
        }
        else{
            System.out.println("ye gareeb");
        }

     }
    }
       

}

public class bank {
    public static void main(String[] args) {
       
        withdrawal obj2 = new withdrawal(500);
        withdrawal obj = new withdrawal(800);

        
        obj2.start();
        obj.start();
        
    }
}
