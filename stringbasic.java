public class stringbasic {
    public static void main(String[] args) {
        String str = "tiwari";
        String str2 = "tiwaui";
        int count =0;
        System.out.print("same value at index value :");
        for(int i=0;i<str.length();i++){
           // System.out.print(str.charAt(i) );
          if(str.charAt(i)== str2.charAt(i)){
            System.out.print(i +" ");
            count ++;

          }
        }
        System.out.println();
        System.out.println( "no. of same element is :"+ count);
    }
}
