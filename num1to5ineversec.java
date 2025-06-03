
class dowloading extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(i*2000);
            }catch( Exception e)
        {    
        }
        }

}
}
public class num1to5ineversec {


    public static void main(String[] args) {
        dowloading obj =new dowloading();
        obj.start();
        
    }
}
