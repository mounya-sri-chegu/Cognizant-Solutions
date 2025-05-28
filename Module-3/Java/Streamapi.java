import java.util.*;
import java.util.stream.*;
public class Streamapi {
    public static void main(String[] args){
        List<Integer> lt=new ArrayList<>();
        lt.add(24);
        
        lt.add(19);
        lt.add(1);
        lt.add(10);
        lt.add(28);

        lt=lt.stream().filter(n ->n%2==0).collect(Collectors.toList());
        for(int a:lt){
            System.out.println(a);
        }


    }
    
}