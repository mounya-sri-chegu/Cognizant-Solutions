import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");

        int a=sc.nextInt();
        System.out.println("entet the second number");
        int b=sc.nextInt();

        System.out.println("enter the operation to be performed:");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+': System.out.println("the result of addition operation is :" +(a+b));
                      break;
            case '-': System.out.println("the result of subtraction operation is:" + (a-b)); 
                       break;
            case '*': System.out.println("the result of multiplication operation is:"+(a*b)); 
                       break;
            case '%': System.out.println("the result of modulo operation is:"+(a%b));
                       break;
            case '/': System.out.println("the result of division operation is:"+(a/b));
                      break;
            
        }



    }
    
}