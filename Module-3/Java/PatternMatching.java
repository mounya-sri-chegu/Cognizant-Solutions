import java.util.*;
public class PatternMatching{
    public static void main(String[] args){
        Test(18);
        Test(19.5);
        Test("mounya");
        Test(false);
        Test(null);
        
        
    }
    public static void Test(Object obj){
        String res=switch(obj){
            case Integer i-> "It's an integer "+i;
            case Double d-> "It's a double value "+d;
            case String s-> "It's a string object "+s;
            case Boolean b-> "It's a boolean value "+b;
            case null->"It's a null value";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        System.out.println(res);
    }
}