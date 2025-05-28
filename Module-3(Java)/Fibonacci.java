import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        System.out.println("the "+num+" th fibannocci of the numberis:" +fib(num));
    }
    public static int fib(int num){
        if(num<=1){
            return num;
        }
        return fib(num-1)+fib(num-2);
    }
}