public class sumofrowsandclo {
    public static void main(String[] args) {
        int arr [][]={{10,2,3,4,5},{5,0,-1,5,6}};
        int sumr=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sumr+=arr[i][j];
               
            }
            System.out.println("sum of rows :" + i + " = " + sumr);
        }
    }
}
