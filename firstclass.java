//import java.util.Scanner;

import java.util.Scanner;

class firstclass{
    public static void main (String args[] ){
        //input
     //   System.out.println("hello world daddy comes");
     /*   System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");*/
        //output
       // Scanner sc = new Scanner(System.in);
       // String name = sc.next();//single word 
       // String fname = sc.nextLine(); //full sentence //type nextint(),nextfloat();
       // System.out.println(name);
    //  System.out.println(fname);
    /*int a =128;
    byte b = (byte)a;
    System.out.println(b);
*/


//cheaking wheather the number is pos neg or zero
/*Scanner sc = new Scanner(System.in);
int i =sc.nextInt() ;
if(i>0){
    System.out.println("positive");
}else if(i<0){
    System.out.println("negative");
}else {
    System.out.println("zero");

}*/

/*Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
 
if(a>b && a>c){
    System.out.println("A is greater");
}else if(b>a && b>c){
    System.out.println("B is greater");
}else{
    System.out.println("C is greater");
}
*/
Scanner year = new Scanner(System.in);
double  i = year.nextDouble();
if(i==366){
    System.out.println("leap year");
}else if(i==365){
System.out.println("not a leap year");
}else{
    System.out.println("invaild year");
}
    }
}