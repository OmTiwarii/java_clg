 interface  Animal {
    void makesound();
}
class dog {
    public  void makesound(){
        System.out.println("bark");
    }
}
public class Interface5 {
    public static void main(String[] args) {

        dog obj = new dog();
        obj.makesound();
        
    }
}
