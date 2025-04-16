import java.util.Scanner;
public class sumofdigit {
    
    public static void main (String args[] ){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        
//int a=123;
int sum =0;
int f;

while(a!=0){
f= a%10;
sum+=f;
a=a/10;

}
System.out.println("the sum of digits is :" +sum);


    }
}
