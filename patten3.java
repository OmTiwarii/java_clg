public class patten3 {
    
public static void main (String args[] ){
      
    for(int i=1;i<=10;i+=2){

        for(int j=10;j>=i;j--4){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }



    for(int i=1;i<=10;i+=2){

        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=10;k>i;k--){
            System.out.print("* ");
        }
        System.out.println();
    }
}
}

