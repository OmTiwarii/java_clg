interface Cleint {
    void print();
    void show(); 
}
class Dev implements Cleint{
    public void print(){
        System.out.println("bill");
    }
    public void show(){
        System.out.println("sbjdbsdbwb");
    }

}


public class Interface 
{
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.show();
        obj.print();
        
    }

}
