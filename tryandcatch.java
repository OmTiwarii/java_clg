public class tryandcatch {
     public static void main(String[] args) {
        
//         int a= 10;
//         int b=0;
       
//         try{ 
//            int c=a/b;
//             System.out.println(c);
//         }catch (Exception e){
//             System.out.println("we can not divide by zeroo");

//         }

//         System.out.println("hee ");
//         System.out.println("luu");
        
int a=10;
int b=0;
int []arr ={1,2,3,3,4,5};
//if there are many exception in try then only the first one will show
try{
    int c=a/b;
    System.out.println(c);
    System.out.println(arr[8]);

}catch(ArithmeticException e){
    System.out.println(e);

}catch ( Exception e){
    System.out.println(e);
   // System.out.println("element is greater then the lenghtofarr");
}finally{
    System.out.println("finallyy");
}

System.out.println("heeiii");
    }
 }
