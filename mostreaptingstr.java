public class mostreaptingstr {
    public static void main(String[] args) {
        String str = "hhhhllllnnn";
        int maxcount=0;
        char maxvalue='0';
        char arr[]= str.toCharArray();
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==c){
               count ++;
                }
            }
            if(count >maxcount){
                maxcount=count;
            maxvalue= c;
               
            }
           
        
        }
        System.out.println(maxcount);
        System.out.println(maxvalue);
    }
}
