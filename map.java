import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<Integer, String> mapp = new HashMap<>();
        // mapp.put("hii", 5);
        // mapp.put("hii2", 8);
        // mapp.put("hii3", 0);
        // System.out.println(mapp);
        // System.out.println(mapp.get("hii3"));
        // System.out.println(mapp.containsKey("hii2"));
        // System.out.println(mapp.containsValue(8));
    

        mapp.put(1, "5");
        mapp.put(2, "8");
        mapp.put(3, "0");
        mapp.put(4,   "tiwari");  

  

        mapp.forEach((key ,value)->{
    if(key>=2){
            System.out.println(key + " "+ value );
    }

    if(value == "tiwari"){
        System.out.println(key);
    }
        });
        


  
    }
}
