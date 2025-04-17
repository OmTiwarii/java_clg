public class evenoddinarr {
    public static void main (String args[] ){
        int evencount = 0;
        int oddcount =0;
        int arr[]={1,2,3,4,2,4,1};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.println("even count is :"+ evencount);
        System.out.println("odd count is : "+oddcount);

        
    }

}
