import java.util.HashSet;

public class repeating {
    public static void main(String[] args) {
           int arr[]={1,1,2,2,3,2};
  HashSet<Integer> set2 = new HashSet<>();
  int count =0;
  for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count ++;
        }

    }
   
  }
  System.out.println(count);
    }
    
}
