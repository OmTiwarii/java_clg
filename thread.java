class MyThread extends Thread{
    public void run(){
        System.out.println("hello");

        try{
            Thread.sleep(5000);
        }catch ( Exception e){
        }
        System.out.println("hii");
       

    }
}
public class thread {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
       // System.out.println("hee");
    }
    
    
}
