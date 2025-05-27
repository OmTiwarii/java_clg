import java.util.HashSet;

public class firstrep {
    public static void main(String[] args) {
        int arr[]={1,2,2,42,4,5,5,3,53,45,3,5};
  HashSet<Integer> set2 = new HashSet<>();
  int count =0;
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]==arr[i-1]){
            set2.add(arr[i]);
            count =1;
            }
            if(count==1){
                break;
            }
        }
        System.out.println(set2);


        for(int i : arr){
            if(set2.contains(i)){
                System.out.println(i);
                 break;
            }
                set2.add(i);
            
        }
    }
}
