 interface Shape {
void area();
    
}
class circle implements Shape {
    public void area(){
        System.out.println(3.14*5*5);
    }
}
public class interface6 {
    public static void main(String[] args) {
     circle obj = new circle();
     obj.area();
    }
    
}
