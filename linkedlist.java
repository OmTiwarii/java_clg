import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class linkedlist {
    public static void main(String[] args) {
        
        LinkedList<Integer> arr = new LinkedList<>();
        long start = System.nanoTime();
        arr.add(5);
        arr.add(4);
        arr.add(8);
      
        System.out.println(arr.contains(9));
        System.out.println(arr.get(0));
        System.out.println(arr);
        long end =System.nanoTime();
        System.out.println(end-start);

        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("a");
        System.out.println(set);
        
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("a");  
        System.out.println(set2);


    }
}
