public class methods {
    static int sum(int a, int b){
        return(a+b);

    }
    void display(){
        System.out.println(sum(3,5));
    }
    void sumele(int n){
        int c;
        int sum=0;
        while(n>0){
            c=n%10;
            sum+=c;
            n/=10;

        }
        System.out.println(sum);
    }
    static void max(int a,int b){
        int sum=a+b;
        int max=0;
        int n=sum;
        while(n>0){
            int c=n%10;
            if(c>max){
                max=c;
            }
            n=n/10;
        }
        System.out.println(max);

    }
    int a =10;
    static int b=1;
    public static void main(String[] args) {
      // System.out.println(sum(3, 8)); 
        methods obj =new methods();
       // obj.display();
        //obj.sumele(123);
       // max(200,9);
       int a=5;
        System.out.println(obj.a +" " + a);
        //System.out.println(b);
    }
}
