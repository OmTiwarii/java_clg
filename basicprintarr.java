import java.util.Scanner;

public class basicprintarr {
    public static void main (String args[] ){
        /*int arr[] ={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


//System.out.println(arr[3]);
*/

//inputing an array ;
 Scanner in = new Scanner(System.in);
 System.out.println("enter the size of array :");
 int n = in.nextInt();
 int arr[] =new int[n];
 System.out.println("enter the values of array :");
 for(int i=0;i<n;i++){
    arr[i]= in.nextInt();
 }
System.out.println("your array is :");
// printing an array 
 for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
 }

//printing revers  of array
 for(int i=n-1; i<n ;i--){
    System.out.println(arr[i]);
 }

 // finding the max element of an array
 int max =0;
 for(int j=0;j<n;j++){
    if(arr[j]>max){
        max=arr[j];
    }
 }
 System.out.println("max element of array is " + max);

    }
}
