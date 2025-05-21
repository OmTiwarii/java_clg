abstract class Payment {
    abstract void pay (int a);
    void succes(){
        System.out.println("payment done ");
    }
}
class UpiPayment extends Payment {
    void pay (int a){
        System.out.println("pay via Upi  :"+ a);
    }

}
class netbanking extends Payment{
    void pay (int b){
        System.out.println("pay by netbanking  :" + b);
    }
}
 class hello{
    public static void main(String[] args) {
        Payment obj = new UpiPayment();
        obj.pay(1000);
        obj.succes();

        Payment obj1 = new netbanking();
        obj1.pay(2000);
        obj1.succes();
    }
}
