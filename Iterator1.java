import java.util.ArrayList;
import java.util.*;

public class Iterator1 {
public static void main(String[] args) {
    ArrayList<String> str = new ArrayList<>();
    str.add("prakhar");
    str.add("chetan");
    str.add ("kanha");
    str.add("sambhav");
    str.add("Sneha");
   // System.out.println(str);
   // Iterator<String> it =str.iterator();
    ListIterator<String> it = str.listIterator();
    while(it.hasNext()){
        String data = it.next();
        System.out.print(data + " ");

        // if(data.startsWith("k")){
        //     it.remove();

        // }
    }
    System.out.println();
    while(it.hasPrevious()){
        String pdata =it.previous();
        System.out.print(pdata+" ");
    }
  
   

}
    
}