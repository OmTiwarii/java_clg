 class parent {
    int a=5;
     
     void eat(){
      System.out.println("maggi eaten");
    }
}
class child extends parent {
      void eat(){
         super.eat();
         System.out.println("pasta eaten");
     }
 }
public class overriding {
     public static void main(String[] args) {
       parent obj = new child();
    // parent obj = new parent();
   //child obj1 = new parent();         
   obj.eat();
     }
 } 




