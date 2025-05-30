import java.util.ArrayList;
import java.util.ListIterator;

public class listtt_it {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
    str.add("prakhar");
    str.add("chetan");
    str.add ("kanha");
    str.add("om");
    str.add("Sneha");
 
    ListIterator<String> it = str.listIterator();
    while(it.hasNext()){
        String data = it.next();

        if(data.length()< 3){
            data ="hee";
            System.out.println(data);
        }else{
            System.out.println(data);
        }

    }
    System.out.println();

    int count = 0;
    // while(it.hasPrevious()){
    //     String data = it.previous();
    //     count++;
    //     if(count!=str.size()){
    //        // data="hee";
    //       it.set("hee");

    //     }
    // }
    // System.out.println(str);

  String find ="kanha";
    while(it.hasPrevious()){
        String data = it.previous();
        count++;
        if(data==find){
            System.out.println(count);
            break;
        }

    }




    }
}
