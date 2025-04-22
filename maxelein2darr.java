public class maxelein2darr {
    public static void main(String[] args) {
        int arr [][]={{1,2,3,4,5},{5,6,3,5,6}};
        int max =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]> max){
                    max= arr[i][j];
                }
            }
        } 
        System.out.println("maxx element in array is :"+ max);

    }
}
