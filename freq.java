import java.util.HashMap;
public class freq {
    

    public static void main(String[] args) {
        String str ="programing is a fun and fun is a programing";
        String[] arr = str.split(" ");

        HashMap< String,Integer> mapp =new HashMap<>();
    
        for(String i : arr){
            mapp.put(i,mapp.getOrDefault(i, 0)+1);
    
        }
        System.out.println(mapp);
}
}
