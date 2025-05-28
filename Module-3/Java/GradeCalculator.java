import java.util.*;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        int marks=sc.nextInt();
        if(marks<=100 && marks>=90){
            System.out.println("Grade is A");
        }else if(marks<90 && marks>=80){
            System.out.println("Grade is B");

        }else if(marks<80 && marks>=70){
            System.out.println("Grade is C");
        }else if(marks <70 && marks>=60)
        {
            System.out.println("Grade is D");
        }
        else if(marks<60){
            System.out.println("Grade is F");
        }
    }
    
}