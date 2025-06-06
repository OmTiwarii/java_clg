import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class filter {
    
    public static void main(String[] args) {
        

        //  List<Integer> evenList =list.stream()
        //                          .filter(n -> n%2 ==0)
        //                         .map( n -> n*5)
        //                          .collect(Collectors.toList());


       
    //    int sum =  list.stream().reduce( 10,(a, b) -> a + b);
    //  System.out.println(sum);
    // List<Integer> evenList =list.stream()
    //          .filter(n -> n>2)
    //          .filter(n -> n%2 ==0)
    //      .collect(Collectors.toList());
    //      Optional<Integer> sum =evenList.stream().reduce( (a, b) -> a + b);

    //   System.out.println(sum);
    List<Integer> list = Arrays.asList(5,10,15,20,25);
    int max = list.stream()
                            // .reduce(Integer::max);
                           . reduce(0,(a,b) -> a>b? a:b);
                        //  System.out.println(max);
                          List<Integer> nmax = list.stream()
                            .filter(a -> a!=max).collect(Collectors.toList());
                            int max2 = nmax.stream().reduce(0,(a,b) -> a>b? a:b);
                            System.out.println(max2);
                               


          
    }
    
}
