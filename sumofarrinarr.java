public class sumofarrinarr {
    public static void main (String args[] ){
        int arr[]={1,2,3,4,2,4,1};
        int arr2[]={1,2,3,4,5,6,7};
        int arr3[]= new int[7];
        for(int i=0;i<arr.length;i++){
            arr3[i]=arr[i]+arr[i];
        }
        System.out.println("arr3 is :");
      for(int i=0;i<arr3.length;i++){
        System.out.println( arr3[i]);
      }
    }
}
