class dowloading extends Thread{

    String fileName;
   public  dowloading(String fileName){
        this.fileName =fileName;

     }
    public void run(){
    for(int i=1;i<=5;i++){
        System.out.println(fileName + "dowloadingg...." +" "+ i*20+ " "+ "%");
        try {
            Thread.sleep(2000);
        }catch( Exception e)
    {    
    }
    }
   

System.out.println(fileName + "dowloaded");

}
}

public class dowloadingfile {
   public static void main(String[] args) {
    String str ="chetanfile";
    String str2 ="sambhavfile";

    dowloading obj =new dowloading(str);
    dowloading obj2 =new dowloading(str2);

    obj.start();
    obj2.start();

    
   }

}
