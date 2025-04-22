public class uniqueeleinarr {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={1,2,4};
        boolean unique = true;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
             unique =true;
             System.out.println("unique element in index no. " + i);
            }else{
                unique=false;
            }
            
        }
        if (unique==false){
            System.out.println("no unique element");
        }

       
    }
}
