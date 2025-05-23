public class greaterthen2arrsubarr {
    public static void main(String[] args) {
       // int[]arr={2,-7,0,5,6,-3,0,1,53,0,534,0};
       int arr[]={1,2,3,4,5};
         int n =arr.length;
int maxum =Integer.MIN_VALUE;
        for(int st=0;st<n;st++){
            if(arr[st]>2 && arr[st]%2==0){
            int currentsum =0;
            for(int end=st;end<n;end++){
                currentsum+=arr[end];
                maxum=Math.max(currentsum,maxum);
            }
        }
    }
    System.out.println(maxum);
}
}
