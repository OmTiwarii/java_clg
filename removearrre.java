import java.util.HashSet;
import java.util.TreeSet;

public class removearrre {
    public static void main(String[] args) {

        int arr[]={1,2,2,42,4,5,3,53,45,3,5};
          TreeSet<Integer> set = new TreeSet<>();
          HashSet<Integer> set2 = new HashSet<>();

          for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            set2.add(arr[i]);
          }
          System.out.println(set);
          System.out.println(set2);



    }
}
