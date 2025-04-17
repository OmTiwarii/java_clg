public class comparearr {

    public static void main (String args[] ){
        int arr[]={1,2,3,4};
        int arr2[]={1,2,3,4};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== arr2[i]){
                count ++;
            }}
            if(count == arr.length){
                System.out.println("arrays are equal");
            }else{
                System.out.println(" not equal");
            }
        
    }
    
}