public class vovelsinstr {
    public static void main(String[] args) {
        String  vovel  = "racecari";
        char arr[]= vovel.toCharArray();
         char ne[] ={};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
            ne +=arr[i];
                }
               
            }

        }
        System.out.println(ne);

    }
}
