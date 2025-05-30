import java.util.HashMap;

public class count_ele_using_hashmap {
    public static void main(String[] args) {
        
    
        String str ="prograaming";
    char[] arr= str.toCharArray();
    HashMap< Character,Integer> mapp =new HashMap<>();

    // for(int i=0;i<arr.length;i++){
    //     int count =0;
    //     for(int j=0;j<arr.length;j++){
    //         if(arr[i]==arr[j]){
    //             count ++;
    //         }

            
    //     }
    //     mapp.put( arr[i],count );
    // }
    

    // System.out.println(mapp);
 
   // String str ="prograaming";

    for(char i : arr){
        mapp.put(i,mapp.getOrDefault(i, 0)+1);

    }
   // System.out.println(mapp.getOrDefault('m', 0));
  System.out.println(mapp);
}
}

