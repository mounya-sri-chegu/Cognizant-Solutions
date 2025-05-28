import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("the number "+ num+" is even number");
        }
        else {
            System.out.println("The number "+num+" is odd number");
        }


    }
    
}