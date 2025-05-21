interface Walkable {
   void  walk();
    void  run();
    
}
 interface Runnable {
    void walk();
    void run();

}
class human implements Runnable,Walkable {
   public void walk(){
System.out.println("done");
   }
   public void run(){
    System.out.println("fine");

   }

    
}



public class interface3 {
    public static void main(String[] args) {
     human obj = new human();
     obj.run();
     obj.walk();
        
    }
}
