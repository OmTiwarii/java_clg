public class strpalindrom {
    public static void main(String[] args) {
        String palindrom = "racecar";
        String reverse="";
        //char[] arr = reverse.toCharArray();
        for(int i= palindrom.length()-1;i>=0;i--){
            reverse+=palindrom.charAt(i);
        
        }
        System.out.println(reverse);
        System.out.println(palindrom);
        System.out.println(reverse.length());
        System.out.println(palindrom.length());
        // comparing address if(reverse==palindrom) ;
        //comparing the values
        if(reverse.equals(palindrom)){
            System.out.println("its a palindrom");
        }else {
            System.out.println("not a palindrom");
        }
    }
}
