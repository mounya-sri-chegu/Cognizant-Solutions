import java.util.*;
public class TryCatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter two numbers to divide");
        int a=sc.nextInt();
        int b=sc.nextInt();

        try{
            System.out.println("the division of two numbers is:"+a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Error:Zero division exception ");

        }
        finally{
            System.out.println("code executed successfully");
        }

    }
    
}