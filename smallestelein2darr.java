public class smallestelein2darr {
    public static void main(String[] args) {
        
        int arr [][]={{10,2,3,4,5},{5,0,-1,5,6}};
        int  smallest = arr[0][1]; ;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++){
               
          if(arr[i][j]< smallest){
            smallest= arr[i][j];
          }
            }
            System.out.println("smallest element is :"+ smallest);

    }
}
