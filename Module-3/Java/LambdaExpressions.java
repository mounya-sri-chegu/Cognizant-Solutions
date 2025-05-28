import java.util.*;
public class LambdaExpressions {
    public static void main(String[] args){
    List<String> arr=new ArrayList<>();
    arr.add("mounya");
    arr.add("neeraja");
    arr.add("harika");
    arr.add("prashanthi");
    arr.add("yajna");

    Collections.sort(arr,(a,b)->a.compareToIgnoreCase(b));

    for(String s:arr){
    System.out.println(s);
    }
}
    
}