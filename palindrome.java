public class palindrome {
    public static void main (String args[] ){
        int a=123;
        int original =a;
        int reverse = 0;

        while(a>0){
            int digit = a% 10;
            reverse = reverse*10 +digit;
            a/=10;
        }
        //System.out.println(reverse);
        if (reverse==original){
            System.out.println("it is  a palindrone");
        }else{
            System.out.println("it is a not  palindrone");

        }
    }
}
