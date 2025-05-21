 interface Cleint1 {
  void show();
    
}
 interface Cleint2 {
void print();
void show();
    
}
class hello implements Cleint1,Cleint2{
    public  void show(){
        System.out.println("pasta");
    }
    public void print(){
        System.out.println(" pizza");

    }
}

public class Interface2 {
    public static void main(String[] args) {
        
    
    hello obj = new hello();
    obj.show();
    obj.print();
    }
    
}
