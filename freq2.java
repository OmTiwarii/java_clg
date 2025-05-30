import java.util.HashMap;

public class freq2 {
    public static void main(String[] args) {
        HashMap< String,Integer> mapp =new HashMap<>();
      
        String str ="aaabcccdddeeef";
        String[] arr = str.split("");

        
        for(String i : arr){
            mapp.put(i,mapp.getOrDefault(i, 0)+1);
    
        }
       

 for(String i : mapp.keySet()){
    if(mapp.get(i)==1){
        System.out.println(i);
        break;
    }
    

   
 }

        // mapp.forEach((key ,value)->{
        //     if(value==1){
        //             System.out.println(key);
                  
        //     }

            //  });



    }
}
