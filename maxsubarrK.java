public class maxsubarrK {
    public static void main(String[] args) {
        
    
    
    //int arr[]={1,2,3,4,5};
  // int arr[]={2,-7,0,5,6,-3,0,1};
  int arr[]={1,2,-3,4};
   int n=arr.length;

    int maxum =Integer.MIN_VALUE;
    for(int st=0;st<n;st++){
        int currentsum =0;
        for(int end=st;end<n;end++){
            currentsum+=arr[end];
            maxum=Math.max(currentsum,maxum);
        }
   


}
System.out.println(maxum);

}
}
