public class charhightolow {
    static void highttolow(){
        String [] str ={"B","A","C","G","F"};
        for(int i=0;i<str.length;i++){
            char c = str[i].charAt(0);
            int ascii = c+32;
            System.out.print((char)ascii+ " ");

        }

    }
    public static void main(String[] args) {
        highttolow();
        
    }
}
