import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a non-negative number");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("factorial of the given number "+ num+" is:"+fact);
    }
    
}