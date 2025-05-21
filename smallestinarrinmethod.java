public class smallestinarrinmethod {
    static void small(int arr[]){
        int small = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small =arr[i];
            }
        }
        System.out.println(small);
    }
    static void average(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        int avr= sum/arr.length;
        System.out.println(avr);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1,7};
        small(arr);
        average(arr);
        
    }
}
