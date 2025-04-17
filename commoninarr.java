public class commoninarr {
    public static void main (String args[] ){
        int arr[]={1,2,6,5};
        int arr2[]={1,2,3,4};

        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr2[i]){
                System.out.println(arr[i]+ " " +arr2[i]);
            }
        }
    }
}
