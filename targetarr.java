public class targetarr {
    public static void main (String args[] ){

        int target = 5;
        int arr[]={1,2,3,4,5};
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = arr[i] +arr[j];
                if(target == sum){
                    System.out.println(i +" " +j);
                }

                
            }
    }
    }
}
