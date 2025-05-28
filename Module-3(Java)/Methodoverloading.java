import java.util.*;
public class Methodoverloading {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two interger values:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    

    System.out.println("enter two double values:");
    double d1=sc.nextDouble();
    double d2=sc.nextDouble();

    System.out.println("enter three integer numbers:");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();

    System.out.println("the addition of two integer numbers:"+add(a,b));
    System.out.println("the addition of two double numbers:"+add(d1,d2));
    System.out.println("the addition three integer numbers:"+add(num1,num2,num3));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double d1,double d2){
        return d1+d2;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }

}